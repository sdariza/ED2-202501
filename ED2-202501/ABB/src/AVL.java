public class AVL extends BinaryTree {

    public int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int fb(Node node) {
        return height(node.left) - height(node.right);
    }

    public Node rSI(Node node) {
        Node aux = node.right;
        node.right = aux.left;
        aux.left = node;
        aux.balance = fb(aux);
        node.balance = fb(node);
        return aux;
    }

    public Node rSD(Node node) {
        Node aux = node.left;
        node.left = aux.right;
        aux.right = node;
        aux.balance = fb(aux);
        node.balance = fb(node);
        return aux;
    }

    @Override
    public Node addNode(Node root, Node newNode) {
        if (root == null) {
            return newNode;
        }
        if (root.data == newNode.data) {
            System.out.println("El elemento ya está");
            return root;
        }
        if (newNode.data > root.data) {
            root.right = addNode(root.right, newNode);
        }
        if (newNode.data < root.data) {
            root.left = addNode(root.left, newNode);
        }
        root.balance = fb(root);
        if (root.balance == 2) {
            if (root.left.balance == -1) {
                root.left = rSI(root.left);
            }
            return rSD(root);
        }
        if (root.balance == -2) {
            if (root.right.balance == 1) {
                root.right = rSD(root.right);
            }
            return rSI(root);
        }
        return root;
    }

    @Override
    public Node delNode(Node root, int newNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delNode'");
    }

    @Override
    public void generateTree(int x) {
        Node newNode = new Node(x);
        if (root == null) {
            root = newNode;
            System.out.println("La raíz ha sido añadida " + root.data);
        } else {
            root = addNode(root, newNode);
        }
    }

    @Override
    public void deleteTree(int x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTree'");
    }

}

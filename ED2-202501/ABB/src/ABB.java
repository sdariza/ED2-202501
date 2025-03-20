
public class ABB extends BinaryTree {

    @Override
    public Node addNode(Node root, Node newNode) {
        if (root.data > newNode.data) {
            if (root.left == null) {
                root.left = newNode;
                System.out.println("Elemento " + newNode.data + " añadido");
            } else {
                root.left = addNode(root.left, newNode);
            }
        } else {
            if (root.data < newNode.data) {
                if (root.right == null) {
                    root.right = newNode;
                    System.out.println("Elemento " + newNode.data + " añadido");
                } else {
                    root.right = addNode(root.right, newNode);
                }
            } else {
                System.out.printf("El elemento %d ya existe \n", newNode.data);
            }
        }
        return root;
    }

    @Override
    public Node delNode(Node node, int x) {
        // casos bases
        if (node == null)// No lo encontré
            return null;
        if (node.data == x) {// Lo encontré debo contemplar y eliminar
            // Caso 1 y 2: No tiene hijos o tiene 1 hijo
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;
            // caso 3: tiene 2 hijos:
            Node pred = mayor(node.left);// busco el mayor de los menores
            node.data = pred.data;
            node.left = delNode(node.left, pred.data);
        }
        if (node.data > x) {
            node.left = delNode(node.left, x);
        }

        if (node.data < x) {
            node.right = delNode(node.right, x);
        }
        return node;

    }

    public Node mayor(Node node) {
        if (node.right == null) {
            return node;
        }
        return mayor(node.right);
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
        root = delNode(root, x);
    }

}

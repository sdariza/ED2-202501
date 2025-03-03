public class AVL extends BinaryTree {

    @Override
    public Node addNodeR(Node node, int x) {
        if (node == null) {
            return new Node(x);
        }

        if (x == node.getData()) {
            System.out.println("El elemento " + x + " ya existe");
            return node;
        }
        if (x < node.getData()) {
            node.setLeft(addNodeR(node.getLeft(), x));
        }
        if (x > node.getData()) {
            node.setRight(addNodeR(node.getRight(), x));
        }
        node.setBalance(height(node.getLeft()) - height(node.getRight()));

        if (node.getBalance() == -2) {
            if (node.getRight().getBalance() == 1) {
                node.setRight(rightRotate(node.getRight()));
            }
            return leftRotate(node);
        }

        if (node.getBalance() == 2) {
            if (node.getLeft().getBalance() == -1) {
                node.setLeft(leftRotate(node.getLeft()));
            }
            return rightRotate(node);
        }

        return node;

    }

    public Node rightRotate(Node node) {
        Node aux = node.getLeft();
        node.setLeft(aux.getRight());
        aux.setRight(node);
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        aux.setBalance(height(aux.getLeft()) - height(aux.getRight()));
        return aux;
    }

    public Node leftRotate(Node node) {
        Node aux = node.getRight();
        node.setRight(aux.getLeft());
        aux.setLeft(node);
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        aux.setBalance(height(aux.getLeft()) - height(aux.getRight()));
        return aux;
    }

    @Override
    public Node deleteNodeR(Node node, int x) {
        if (node == null) {
            System.out.printf("Elemento %d no encontrado \n", x);
            return null;
        }
        if (x < node.getData())
            node.setLeft(deleteNodeR(node.getLeft(), x));
        if (x > node.getData())
            node.setRight(deleteNodeR(node.getRight(), x));

        if (node.getData() == x) {
            if (node.getLeft() == null) {
                return node.getRight();
            }

            if (node.getRight() == null) {
                return node.getLeft();
            }

            Node pred = searchPredecessor(node.getLeft());
            node.setData(pred.getData());
            node.setLeft(deleteNodeR(node.getLeft(), pred.getData()));
        }
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        if (node.getBalance() == -2) {
            if (node.getRight().getBalance() == 1) {
                node.setRight(rightRotate(node.getRight()));
            }
            return leftRotate(node);
        }
        if (node.getBalance() == 2) {
            if (node.getLeft().getBalance() == -1) {
                node.setLeft(leftRotate(node.getLeft()));
            }
            return rightRotate(node);

        }
        return node;
    }

}

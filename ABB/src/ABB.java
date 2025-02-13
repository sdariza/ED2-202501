public class ABB {
    Node root;

    public void addNodeABBR(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            if (root.data > newNode.data) {
                if (root.left == null) {
                    root.left = newNode;
                } else {
                    addNodeABBR(root.left, newNode);
                }
            } else {
                if (root.data < newNode.data) {
                    if (root.right == null) {
                        root.right = newNode;
                    } else {
                        addNodeABBR(root.right, newNode);
                    }
                } else {
                    System.out.printf("El elemento %d ya existe \n", newNode.data);
                }
            }
        }
    }

    public void generateABB(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            addNodeABBR(root, newNode);
        }
    }

    public boolean searchABB(Node root, int x) {
        if (root == null) {
            return false;
        } else if (root.data == x) {
            return true;
        } else if (root.data > x) {
            return searchABB(root.left, x);
        } else {
            return searchABB(root.right, x);
        }
    }
}

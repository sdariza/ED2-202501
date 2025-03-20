public abstract class BinaryTree {
    protected Node root;

    public abstract Node addNode(Node root, Node newNode);

    public abstract Node delNode(Node root, int newNode);

    public abstract void generateTree(int x);

    public abstract void deleteTree(int x);

    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data + " fb: " + root.balance);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public Node searchNode(Node root, int x) {
        if (root == null) {
            return root;
        } else if (root.data == x) {
            return root;
        } else if (root.data > x) {
            return searchNode(root.left, x);
        } else {
            return searchNode(root.right, x);
        }
    }
}

public class Node {
    int data;
    Node left, right;

    // This is a constructor for the `Node` class in Java. It takes an integer
    // `data` as a parameter and
    // initializes the `data` field of the `Node` object to the value of the
    // parameter. It also initializes
    // the `left` and `right` child nodes of the current node to `null`.
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

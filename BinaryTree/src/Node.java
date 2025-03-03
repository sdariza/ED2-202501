public class Node {
    // These lines are declaring private instance variables in the `Node` class in
    // Java. Here's what each
    // variable represents:
    private int data, balance;
    private Node left, right;

    // This is a constructor for the `Node` class in Java. When a new `Node` object
    // is created with an
    // integer parameter `data`, this constructor initializes the `data` field of
    // the node with the
    // provided data value, and sets the `left` and `right` child nodes to `null`.
    // Additionally, it sets
    // the initial balance of the node to 0.
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.balance = 0;
        // this.height = 1;
    }

    /**
     * The function setData sets the value of the data variable in the class to the
     * provided input.
     * 
     * @param data The `setData` method takes an integer parameter named `data` and
     *             sets the value of the
     *             class variable `this.data` to the value passed as the parameter.
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * The function sets the left child node of a binary tree node.
     * 
     * @param left The `left` parameter in the `setLeft` method is a `Node` object
     *             that represents the left
     *             child node of a binary tree node.
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * The function sets the right child node of a binary tree node.
     * 
     * @param right The `right` parameter in the `setRight` method is a `Node`
     *              object that represents the
     *              right child node of a binary tree node.
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * The setBalance function in Java sets the balance of an object to a specified
     * value.
     * 
     * @param balance The `balance` parameter in the `setBalance` method is an
     *                integer value that
     *                represents the new balance to be set for an object.
     */

    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * The `getData` function in Java returns the value of the `data` variable.
     * 
     * @return The `data` variable is being returned.
     */

    public int getData() {
        return data;
    }

    /**
     * The function `getLeft()` returns the left child node of a given node.
     * 
     * @return The `left` node is being returned.
     */
    public Node getLeft() {
        return left;
    }

    /**
     * The `getRight` function in Java returns the right child node of a given node.
     * 
     * @return The `right` node is being returned.
     */
    public Node getRight() {
        return right;
    }

    /**
     * The `getBalance` function in Java returns the current balance.
     * 
     * @return The `balance` variable is being returned.
     */
    public int getBalance() {
        return balance;
    }

    // public int getHeight() {
    //     return height;
    // }

    // public void setHeight(int height) {
    //     this.height = height;
    // }

}

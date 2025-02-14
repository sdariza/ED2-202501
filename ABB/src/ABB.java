public class ABB {
    Node root;

    /**
     * The `addNodeABBR` function adds a new node to a binary search tree based on
     * the comparison of node
     * values.
     * 
     * @param root    The `root` parameter in the `addNodeABBR` method represents
     *                the current node being
     *                evaluated in a binary search tree. It is the starting point
     *                for the insertion of a new node
     *                (`newNode`) into the tree. The method compares the `data`
     *                value of the `root` node
     * @param newNode The `newNode` parameter in the `addNodeABBR` method represents
     *                the new node that you
     *                want to add to the binary search tree. This method is used to
     *                recursively add a new node to the
     *                binary search tree based on the comparison of the `data`
     *                values of the nodes.
     */
    public void addNodeABBR(Node root, Node newNode) {
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

    /**
     * The function `generateABB` creates a new node with the given data and adds it
     * to a binary search
     * tree (ABB).
     * 
     * @param data The `data` parameter in the `generateABB` method represents the
     *             integer value that you
     *             want to add to the binary search tree (BST) as a new node. This
     *             method creates a new node with the
     *             given data and then adds it to the BST.
     */
    public void generateABB(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            addNodeABBR(root, newNode);
        }
    }

    /**
     * The function `searchABB` recursively searches for a given integer `x` in a
     * binary search tree
     * starting from the root node.
     * 
     * @param root The `root` parameter is a reference to the root node of a binary
     *             search tree (BST). The
     *             `Node` class likely represents a node in the BST and has at least
     *             the following properties:
     * @param x    The parameter `x` in the `searchABB` method represents the value
     *             that you are searching for
     *             in the binary search tree. The method recursively searches the
     *             binary search tree starting from the
     *             `root` node to find if the value `x` exists in the tree. If the
     *             value is found,
     * @return The method is returning a boolean value, either `true` if the value
     *         `x` is found in the
     *         binary search tree rooted at `root`, or `false` if the value is not
     *         found.
     */
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

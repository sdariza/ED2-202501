import java.util.LinkedList;
import java.util.Queue;

public abstract class BinaryTree {
    // The line `protected Node root;` in the `BinaryTree` class is declaring a
    // protected instance variable
    // named `root` of type `Node`. This variable is used to store the root node of
    // the binary tree. By
    // declaring it as `protected`, it can be accessed by subclasses of `BinaryTree`
    // within the same
    // package or by subclasses in different packages if they inherit from
    // `BinaryTree`. This allows
    // subclasses to work with the root node of the binary tree without exposing it
    // to external classes.
    protected Node root;

    /**
     * The function addNodeR recursively adds a new node to a tree starting from the
     * root node.
     * 
     * @param root    The `root` parameter is a reference to the root node of a tree
     *                data structure where the
     *                new node will be added.
     * @param newNode The `newNode` parameter represents the node that you want to
     *                add to the tree.
     * @return The method `addNodeR` is returning a `Node` object.
     */
    public abstract Node addNodeR(Node root, Node newNode);

    /**
     * The function `deleteNodeR` is a Java method that deletes a node with a
     * specific value recursively.
     * 
     * @param node The `node` parameter is the root node of a binary search tree
     *             from which we want to
     *             delete a node with the value `x`.
     * @param x    The parameter `x` represents the value that you want to delete
     *             from the binary search tree.
     *             The `deleteNodeR` method is a recursive function that deletes a
     *             node with the value `x` from the
     *             binary search tree starting from the given `node`.
     * @return The method `deleteNodeR` is returning a `Node` object.
     */
    public abstract Node deleteNodeR(Node node, int x);

    /**
     * The `generateTree` function creates a new node with the given data and adds
     * it to the tree either as
     * the root or by recursively finding the correct position.
     * 
     * @param data The `data` parameter in the `generateTree` method represents the
     *             value that will be
     *             stored in a new node of the tree. This value will be used to
     *             create a new `Node` object with the
     *             specified data.
     */
    public void generateTree(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            System.out.println("La raíz ha sido añadida " + root.getData());
        } else {
            addNodeR(root, newNode);
        }
    }

    /**
     * The function `searchSBT` recursively searches for a specific integer `x` in a
     * binary search tree
     * starting from the root node.
     * 
     * @param root The `root` parameter is the root node of a binary search tree
     *             (BST) that you want to
     *             search in.
     * @param x    The parameter `x` in the `searchSBT` method represents the value
     *             that you are searching for
     *             in the binary search tree (BST). The method recursively searches
     *             the BST starting from the `root`
     *             node to find if the value `x` exists in the tree. If the value is
     *             found
     * @return The method `searchSBT` returns a boolean value - `true` if the value
     *         `x` is found in the
     *         binary search tree starting from the given `root`, and `false`
     *         otherwise.
     */
    public boolean searchSBT(Node root, int x) {
        if (root == null) {
            return false;
        } else if (root.getData() == x) {
            return true;
        } else if (root.getData() > x) {
            return searchSBT(root.getLeft(), x);
        } else {
            return searchSBT(root.getRight(), x);
        }
    }

    /**
     * The function searches for the predecessor node of a given node in a binary
     * search tree.
     * 
     * @param node The `searchPredecessor` method you provided is a recursive method
     *             to find the
     *             predecessor of a given node in a binary search tree. The
     *             predecessor of a node in a binary search
     *             tree is the node with the largest key that is smaller than the
     *             key of the given node.
     * @return The method `searchPredecessor` is returning the predecessor node of
     *         the given `node`. If the
     *         right child of the current node is not null, it recursively calls the
     *         method on the right child
     *         until it reaches a node where the right child is null, at which point
     *         it returns that node as the
     *         predecessor.
     */
    public Node searchPredecessor(Node node) {
        if (node.getRight() == null) {
            return node;
        }
        return searchPredecessor(node.getRight());
    }

    /**
     * The `delete` function in Java deletes a node with value `x` from a binary
     * search tree.
     * 
     * @param x The parameter `x` in the `delete` method represents the value that
     *          you want to delete from
     *          the binary search tree. The method will search for this value in the
     *          tree and remove it if it
     *          exists.
     */
    public void delete(int x) {
        if (root == null) {
            System.out.println("El árbol está vacío");
        } else {
            root = deleteNodeR(root, x);
        }
    }

    /**
     * The `levelOrderTraversal` function performs a level order traversal on a
     * binary tree starting from a
     * given node.
     * 
     * @param node The `node` parameter in the `levelOrderTraversal` method
     *             represents the root node of a
     *             binary tree. The method performs a level-order traversal starting
     *             from the given root node, visiting
     *             each node in the tree level by level from left to right.
     */
    public void levelOrderTraversal(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node element = q.poll();
            System.out.print(element.getData() + " - fb: " + element.getBalance() + "|");
            if (element.getLeft() != null)
                q.add(element.getLeft());
            if (element.getRight() != null)
                q.add(element.getRight());
        }
        System.out.println();
    }

    /**
     * The `sumaNR` function calculates the sum of all node values in a binary tree
     * using a non-recursive
     * approach with a queue.
     * 
     * @param node The `sumaNR` method you provided calculates the sum of all the
     *             data values in a binary
     *             tree using a non-recursive approach. The parameter `node`
     *             represents the root node of the binary
     *             tree from which the sum calculation starts.
     * @return The `sumaNR` method is returning the sum of all the data values in
     *         the nodes of a binary
     *         tree starting from the given `node`.
     */
    public int sumaNR(Node node) {
        int cont = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node element = q.poll();
            cont += element.getData();
            if (element.getLeft() != null)
                q.add(element.getLeft());
            if (element.getRight() != null)
                q.add(element.getRight());
        }
        return cont;
    }

    /**
     * The function `sumaR` recursively calculates the sum of all nodes in a binary
     * tree starting from a
     * given node.
     * 
     * @param node The `sumaR` method you provided is a recursive method that
     *             calculates the sum of all the
     *             nodes in a binary tree. It takes a `Node` object as a parameter.
     *             The `Node` class likely represents
     *             a node in a binary tree and has methods such as `getData()`, `get
     * @return The method `sumaR` is recursively calculating the sum of all the
     *         nodes in a binary tree
     *         starting from the given `node`. It returns the sum of the data in the
     *         current node, plus the sum of
     *         the data in the left subtree of the current node, plus the sum of the
     *         data in the right subtree of
     *         the current node.
     */
    public int sumaR(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getData() + sumaR(node.getLeft()) + sumaR(node.getRight());
    }

    /**
     * The function calculates the height of a binary tree starting from a given
     * node.
     * 
     * @param node The `node` parameter in the `height` method represents a node in
     *             a binary tree. The
     *             method calculates the height of the binary tree starting from the
     *             given node. If the node is null,
     *             it means that there are no more nodes in that branch of the tree,
     *             so the height is considered
     * @return The height of the binary tree rooted at the given node is being
     *         returned.
     */
    public int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }

}

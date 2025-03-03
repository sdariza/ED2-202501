public class AVL extends BinaryTree {

    /**
     * The function adds a node with a given value to a binary search tree while
     * maintaining balance using
     * rotation operations.
     * 
     * @param node The `node` parameter in the `addNodeR` method represents the
     *             current node in a binary
     *             search tree where you want to add a new node with value `x`. If
     *             the `node` is `null`, it means the
     *             tree is empty, and a new node with value `x`
     * @param x    The `addNodeR` method you provided seems to be an implementation
     *             of adding a node to a
     *             binary search tree with balancing based on AVL tree rules. The
     *             parameter `x` represents the value
     *             that you want to add to the binary search tree.
     * @return The method `addNodeR` returns a `Node` object.
     */
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

    /**
     * The `rightRotate` function performs a right rotation on a given node in a
     * binary tree.
     * 
     * @param node The `node` parameter in the `rightRotate` method represents the
     *             node in a binary search
     *             tree that needs to be rotated to the right. The method performs a
     *             right rotation operation on this
     *             node to balance the tree.
     * @return The `rightRotate` method is returning the node that was rotated to
     *         the right, which is the
     *         new root of the subtree.
     */
    public Node rightRotate(Node node) {
        Node aux = node.getLeft();
        node.setLeft(aux.getRight());
        aux.setRight(node);
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        aux.setBalance(height(aux.getLeft()) - height(aux.getRight()));
        return aux;
    }

    /**
     * The `leftRotate` function performs a left rotation on a given node in a
     * binary tree.
     * 
     * @param node The `node` parameter in the `leftRotate` method represents the
     *             node in a binary search
     *             tree that needs to be rotated to the left. The method performs a
     *             left rotation operation on this
     *             node to balance the tree.
     * @return The `leftRotate` method is returning the new root node after
     *         performing a left rotation on
     *         the input node.
     */
    public Node leftRotate(Node node) {
        Node aux = node.getRight();
        node.setRight(aux.getLeft());
        aux.setLeft(node);
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        aux.setBalance(height(aux.getLeft()) - height(aux.getRight()));
        return aux;
    }

    /**
     * The function `deleteNodeR` recursively deletes a node with a specific value
     * from a binary search
     * tree while maintaining balance using rotations.
     * 
     * @param node The `node` parameter in the `deleteNodeR` method represents the
     *             current node being
     *             processed in a binary search tree. The method is used to delete a
     *             node with a specific value `x`
     *             from the binary search tree. The method recursively traverses the
     *             tree to find the node with the
     *             value
     * @param x    The `x` parameter in the `deleteNodeR` method represents the
     *             value of the node that you
     *             want to delete from the binary search tree. The method
     *             recursively searches for the node with the
     *             value `x` and deletes it from the tree while maintaining the
     *             properties of a binary search tree.
     * @return The method is returning a Node object.
     */
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

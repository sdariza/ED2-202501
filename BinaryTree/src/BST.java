public class BST extends BinaryTree {
    /**
     * The function `addNodeR` recursively adds a new node to a binary search tree
     * based on the node's data
     * value.
     * 
     * @param node    The `node` parameter in the `addNodeR` method represents the
     *                current node in a binary
     *                search tree where you want to add a new node (`newNode`). The
     *                method recursively traverses the tree
     *                to find the correct position for inserting the new node based
     *                on its data value. If the data
     * @param newNode The `newNode` parameter represents the node that you want to
     *                add to the binary search
     *                tree. It contains the data value that you want to insert into
     *                the tree.
     * @return The method `addNodeR` is returning a `Node` object.
     */
    @Override
    public Node addNodeR(Node node, int x) {
        if (node.getData() > x) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(x));
                System.out.println("Elemento " + x + " añadido");
            } else {
                node.setLeft(addNodeR(node.getLeft(), x));
            }
        } else {
            if (node.getData() < x) {
                if (node.getRight() == null) {
                    node.setRight(new Node(x));
                    System.out.println("Elemento " + x + " añadido");
                } else {
                    node.setRight(addNodeR(node.getRight(), x));
                }
            } else {
                System.out.printf("El elemento %d ya existe \n", x);
            }
        }
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        return node;
    }

    /**
     * The `deleteNodeR` function in Java recursively deletes a node with a specific
     * value from a binary
     * search tree while maintaining the binary search tree properties.
     * 
     * @param node The `node` parameter in the `deleteNodeR` method represents the
     *             current node being
     *             processed in a binary search tree. The method is used to delete a
     *             node with a specific value `x`
     *             from the binary search tree.
     * @param x    The parameter `x` in the `deleteNodeR` method represents the
     *             value that you want to delete
     *             from the binary search tree. The method recursively searches for
     *             the node with the value `x` and
     *             then deletes it from the tree while maintaining the properties of
     *             a binary search tree.
     * @return The method `deleteNodeR` returns the updated `Node` after deleting
     *         the node with value `x`
     *         from the binary search tree.
     */

    @Override
    public Node deleteNodeR(Node node, int x) {
        // casos bases
        if (node == null) {// No lo encontré
            System.out.printf("Elemento %d no encontrado \n", x);
            return null;
        }
        if (node.getData() == x) {// Lo encontré debo contemplar y eliminar
            // Caso 1 y 2: No tiene hijos o tiene 1 hijo
            if (node.getLeft() == null)
                return node.getRight();
            if (node.getRight() == null)
                return node.getLeft();
            // caso 3: tiene 2 hijos:
            Node pred = searchPredecessor(node.getLeft());// busco el mayor de los menores
            node.setData(pred.getData());
            node.setLeft(deleteNodeR(node.getLeft(), pred.getData()));
        }
        if (node.getData() > x) {
            node.setLeft(deleteNodeR(node.getLeft(), x));
        }

        if (node.getData() < x) {
            node.setRight(deleteNodeR(node.getRight(), x));
        }
        node.setBalance(height(node.getLeft()) - height(node.getRight()));
        return node;
    }

}

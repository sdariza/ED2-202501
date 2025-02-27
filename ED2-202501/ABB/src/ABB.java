import java.util.LinkedList;
import java.util.Queue;

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
    public Node addNodeABBR(Node root, Node newNode) {
        if (root.data > newNode.data) {
            if (root.left == null) {
                root.left = newNode;
                System.out.println("Elemento " + newNode.data + " añadido");
            } else {
                root.left = addNodeABBR(root.left, newNode);
            }
        } else {
            if (root.data < newNode.data) {
                if (root.right == null) {
                    root.right = newNode;
                    System.out.println("Elemento " + newNode.data + " añadido");
                } else {
                    root.right = addNodeABBR(root.right, newNode);
                }
            } else {
                System.out.printf("El elemento %d ya existe \n", newNode.data);
            }
        }
        root.balance = height(root.left) - height(root.right);
        return root;
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
            System.out.println("La raíz ha sido añadida " + root.data);
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

    /**
     * Esta función retorna el mayor de los menores
     * 
     * @param node
     * @return
     */
    public Node mayor(Node node) {
        if (node.right == null) {
            return node;
        }
        return mayor(node.right);
    }

    public Node deleteNodeR(Node node, int x) {
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
            node.left = deleteNodeR(node.left, pred.data);
        }
        if (node.data > x) {
            node.left = deleteNodeR(node.left, x);
        }

        if (node.data < x) {
            node.right = deleteNodeR(node.right, x);
        }
        node.balance = height(node.left) - height(node.right);
        return node;
    }

    public void delete(int x) {
        root = deleteNodeR(root, x);
    }

    public void levelOrderTraversal(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node element = q.poll();
            System.out.print(element.data + " - fb: " + element.balance + "|");
            if (element.left != null)
                q.add(element.left);
            if (element.right != null)
                q.add(element.right);
        }
        System.out.println();
    }

    /**
     * Suma de todos los elementos de un ABB
     */
    public int sumaNR(Node node) {
        int cont = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node element = q.poll();
            cont += element.data;
            if (element.left != null)
                q.add(element.left);
            if (element.right != null)
                q.add(element.right);
        }
        return cont;
    }

    /**
     * The function `sumaR` recursively calculates the sum of all nodes in a binary
     * tree starting from a
     * given node.
     * 
     * @param node The `node` parameter in the `sumaR` method represents a node in a
     *             binary tree. The
     *             method calculates the sum of all the values in the tree rooted at
     *             the given node. It recursively
     *             traverses the tree and adds up the values of the current node,
     *             its left subtree, and its
     * @return The method `sumaR` is recursively calculating the sum of all the
     *         nodes in a binary tree
     *         starting from the given `node`. If the `node` is null, it returns 0.
     *         Otherwise, it returns the sum
     *         of the current node's data, the sum of all nodes in the left subtree,
     *         and the sum of all nodes in
     *         the right subtree.
     */
    public int sumaR(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data + sumaR(node.left) + sumaR(node.right);
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
        return 1 + Math.max(height(node.left), height(node.right));
    }

}

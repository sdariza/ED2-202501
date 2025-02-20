public class App {
    public static void main(String[] args) throws Exception {
        ABB myAbb = new ABB();
        myAbb.generateABB(100);
        myAbb.generateABB(20);
        myAbb.generateABB(850);
        myAbb.generateABB(1000);
        myAbb.generateABB(100);
        myAbb.generateABB(0);
        if (myAbb.searchABB(myAbb.root, 0)) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento no encontrado");
        }
        myAbb.levelOrderTraversal(myAbb.root);
        myAbb.delete(0);
        myAbb.levelOrderTraversal(myAbb.root);
        System.out.println(myAbb.sumaNR(myAbb.root));
        System.out.println(myAbb.sumaR(myAbb.root));
        // Note: add: preorder, inorder, postorder and level-order.
        // Queue<Node> q = new LinkedList<>();
        // q.add(myAbb.root);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ABB myAbb = new ABB();
        myAbb.generateTree(10);
        myAbb.generateTree(4);
        myAbb.generateTree(6);
        myAbb.generateTree(12);
        myAbb.generateTree(20);
        myAbb.generateTree(14);
        myAbb.generateTree(425);
        myAbb.generateTree(90);
        myAbb.generateTree(19);
        myAbb.generateTree(1);
        myAbb.generateTree(22);

        System.out.println("Preorden");
        myAbb.preOrder(myAbb.root);

        System.out.println("Eliminando el 4");
        myAbb.deleteTree(4);
        System.out.println("Preorden resultante");
        myAbb.preOrder(myAbb.root);

        if (myAbb.searchNode(myAbb.root, 4) != null)
            System.out.println("El elemento 4 está");
        else
            System.out.println("El elemento 4 no está");

        AVL myAvl = new AVL();
        myAvl.generateTree(10);
        myAvl.generateTree(4);
        myAvl.generateTree(6);
        myAvl.generateTree(12);
        myAvl.generateTree(20);
        myAvl.generateTree(14);
        myAvl.generateTree(425);
        myAvl.generateTree(90);
        myAvl.generateTree(19);
        myAvl.generateTree(1);
        myAvl.generateTree(22);
        System.out.println("AVL");
        myAvl.preOrder(myAvl.root);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        SBT mySBT = new SBT();
        mySBT.generateTree(25);
        mySBT.generateTree(10);
        mySBT.generateTree(30);
        mySBT.generateTree(5);
        mySBT.generateTree(15);
        mySBT.generateTree(20);
        if (mySBT.searchSBT(mySBT.getRoot(), 0)) {
            System.out.println("Elemento 0 encontrado");
        } else {
            System.out.println("Elemento no encontrado");
        }
        System.out.println("LevelOrder");
        mySBT.levelOrderTraversal(mySBT.getRoot());
        System.out.println("Se elimina el 0");
        mySBT.delete(0);
        System.out.println("LevelOrder resultante");
        mySBT.levelOrderTraversal(mySBT.getRoot());
        System.out.println("Suma no recursiva de los elementos del árbol");
        System.out.println(mySBT.sumaNR(mySBT.getRoot()));
        System.out.println("Suma recursiva de los elementos del árbol");
        System.out.println(mySBT.sumaR(mySBT.getRoot()));
        System.out.println("El árbol tiene altura: " + mySBT.height(mySBT.getRoot()));

        AVL myAVL = new AVL();
        myAVL.generateTree(25);
        myAVL.generateTree(10);
        myAVL.generateTree(30);
        myAVL.generateTree(5);
        myAVL.generateTree(15);
        myAVL.generateTree(20);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL.getRoot());


        AVL myAVL2 = new AVL();        
        myAVL2.generateTree(10);
        myAVL2.generateTree(5);
        myAVL2.generateTree(25);
        myAVL2.generateTree(20);
        myAVL2.generateTree(30);
        myAVL2.generateTree(15);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL2.getRoot());
        AVL myAVL3 = new AVL();        
        myAVL3.generateTree(10);
        myAVL3.generateTree(5);
        myAVL3.generateTree(20);
        myAVL3.generateTree(15);
        myAVL3.generateTree(25);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL3.getRoot());
        myAVL3.delete(5);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL3.getRoot());
        AVL myAVL4 = new AVL();        
        myAVL4.generateTree(50);
        myAVL4.generateTree(30);
        myAVL4.generateTree(70);
        myAVL4.generateTree(15);
        myAVL4.generateTree(40);
        myAVL4.generateTree(55);
        myAVL4.generateTree(80);
        myAVL4.generateTree(10);
        myAVL4.generateTree(20);
        myAVL4.generateTree(35);
        myAVL4.generateTree(42);
        myAVL4.generateTree(52);
        myAVL4.generateTree(60);
        myAVL4.generateTree(90);
        myAVL4.generateTree(7);
        myAVL4.generateTree(18);
        myAVL4.generateTree(25);
        myAVL4.generateTree(37);
        myAVL4.generateTree(58);
        myAVL4.generateTree(66);
        myAVL4.generateTree(17);

        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());
        myAVL4.delete(7);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());
        myAVL4.delete(10);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());
        myAVL4.delete(17);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());

        myAVL4.delete(18);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());

        myAVL4.delete(25);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());

        myAVL4.delete(42);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());

        myAVL4.delete(52);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());

        myAVL4.delete(58);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());

        myAVL4.delete(60);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());
        myAVL4.delete(66);
        System.out.println("LevelOrder");
        myAVL.levelOrderTraversal(myAVL4.getRoot());
    }
}

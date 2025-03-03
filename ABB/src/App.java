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
    }
}

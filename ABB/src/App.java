public class App {
    public static void main(String[] args) throws Exception {
        SBT mySBT = new SBT();
        mySBT.generateTree(100);
        mySBT.generateTree(20);
        mySBT.generateTree(850);
        mySBT.generateTree(1000);
        mySBT.generateTree(100);
        mySBT.generateTree(0);
        if (mySBT.searchSBT(mySBT.getRoot(), 0)) {
            System.out.println("Elemento 0 encontrado");
        } else {
            System.out.println("Elemento no encontrado");
        }
        System.out.println("LevelOrder");
        System.out.println(mySBT.getRoot());
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
    }
}

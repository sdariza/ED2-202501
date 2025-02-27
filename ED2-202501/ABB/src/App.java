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
            System.out.println("Elemento 0 encontrado");
        } else {
            System.out.println("Elemento no encontrado");
        }
        System.out.println("LeverOrder");
        myAbb.levelOrderTraversal(myAbb.root);
        System.out.println("Se elimina el 0");
        myAbb.delete(0);
        System.out.println("LeverOrder resultante");
        myAbb.levelOrderTraversal(myAbb.root);
        System.out.println("Suma no recursiva de los elementos del árbol");
        System.out.println(myAbb.sumaNR(myAbb.root));
        System.out.println("Suma recursiva de los elementos del árbol");
        System.out.println(myAbb.sumaR(myAbb.root));
        System.out.println("El árbol tiene altura: "+myAbb.height(myAbb.root));
    }
}

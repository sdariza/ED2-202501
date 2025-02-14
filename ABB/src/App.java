import java.util.LinkedList;
import java.util.Queue;

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

        // Note: add: preorder, inorder, postorder and by levels.
        // Queue<Node> q = new LinkedList<>();
        // q.add(myAbb.root);
    }
}

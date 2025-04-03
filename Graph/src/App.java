public class App {
    public static void main(String[] args) throws Exception {

        Graph myGraph1 = new Graph();
        myGraph1.addNode("1");
        myGraph1.addNode("2");
        myGraph1.addNode("3");
        myGraph1.addNode("4");
        myGraph1.addNode("5");
        myGraph1.addNode("6");
        myGraph1.addNode("7");

        myGraph1.addAdy("1", "2");

        myGraph1.showNodes();

    }
}

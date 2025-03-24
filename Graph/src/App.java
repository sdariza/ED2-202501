public class App {
    public static void main(String[] args) throws Exception {

        Graph G = new Graph();
        String[] nodes = { "1", "2", "3", "4", "5", "6", "7" };

        for (String node : nodes) {
            G.addNode(node);
        }

        G.addEdge("1", "2");
        G.addEdge("1", "3");
        G.addEdge("1", "4");

        G.addEdge("2", "5");
        G.addEdge("2", "6");

        G.addEdge("3", "4");

        G.addEdge("4", "5");
        G.addEdge("4", "7");

        G.addEdge("5", "6");
        G.addEdge("5", "7");

        G.addEdge("6", "7");

        G.depthFirstSearch("2");

        G.bfs("2");
    }
}

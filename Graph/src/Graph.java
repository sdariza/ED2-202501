import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, Node> nodes;
    private List<Edge> edges;
    private Map<Node, List<Node>> adjacencyList;

    public Graph() {
        this.nodes = new HashMap<>();
        this.edges = new ArrayList<>();
        this.adjacencyList = new HashMap<>();
    }

    public void addNode(String value) {
        if (!nodes.containsKey(value)) {
            Node newNode = new Node(value);
            nodes.put(value, newNode);
            adjacencyList.put(newNode, new ArrayList<>());
        } else {
            System.out.println(value + " ya existe en el grafo");
        }
    }

    public void addEdge(String vi, String vj) {
        if (nodes.containsKey(vi) && nodes.containsKey(vj)) {
            Node nodeVi = nodes.get(vi);
            Node nodeVj = nodes.get(vj);
            edges.add(new Edge(vi, vj));
            adjacencyList.get(nodeVi).add(nodeVj);
            adjacencyList.get(nodeVj).add(nodeVi);
        }
    }
}
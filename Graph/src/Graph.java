import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph {
    private Map<String, Node> nodes;
    private Map<Node, List<Node>> adjacencyList;

    public Graph() {
        this.nodes = new HashMap<>();
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
            adjacencyList.get(nodeVi).add(nodeVj);
            adjacencyList.get(nodeVj).add(nodeVi);
        }
    }

    public void showNodes() {
        for (String node : nodes.keySet()) {
            System.out.print(node + "|");
        }
        System.out.println();
    }

    public void depthFirstSearch(String startValue) {
        System.out.println("DFS from: " + startValue);
        Node startNode = nodes.get(startValue);
        if (startNode != null) {
            Map<Node, Boolean> visited = new HashMap<>();
            dfs(startNode, visited);
        }
        System.out.println();
    }

    public void dfs(Node current, Map<Node, Boolean> visited) {
        visited.put(current, true);
        System.out.print("-->" + current.getValue());
        for (Node neighbor : adjacencyList.get(current)) {
            if (!visited.getOrDefault(neighbor, false)) {
                dfs(neighbor, visited);
            }
        }
    }

    public void bfs(String startValue) {
        Node startNode = nodes.get(startValue);
        if (startNode == null)
            return;

        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        visited.put(startNode, true);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print("-->" + current.getValue());

            for (Node neighbor : adjacencyList.get(current)) {
                if (!visited.getOrDefault(neighbor, false)) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
        }
    }

}
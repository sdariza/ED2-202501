import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, Node> nodes;
    private Map<Node, List<Node>> ady;

    public Graph(){
        this.nodes = new HashMap<>();
        this.ady = new HashMap<>();
    }

    public void addNode(String value) {

    }

    public void addAdy(String vi, String vj){

    }

    public void showNodes(){
        for (String node : nodes.keySet()) {
            System.out.println(node);
        }
    }

}

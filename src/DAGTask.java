import java.util.ArrayList;
import java.util.List;

class Node {
	DAGTask t;
	int id;
	long wcet;

	public Node(int id, long wcet, DAGTask t) {
		this.id = id;
		this.wcet = wcet;
		this.t = t;
	}

	public DAGTask getT() {
		return t;
	}

	public void setT(DAGTask t) {
		this.t = t;
	}

}

class Edge {
	DAGTask t;
	int id;
	Node prec;
	Node succ;

	public Edge(int id, Node prec, Node succ, DAGTask t) {
		this.id = id;
		this.prec = prec;
		this.succ = succ;
		this.t = t;
	}

	public DAGTask getT() {
		return t;
	}

	public void setT(DAGTask t) {
		this.t = t;
	}
}

public class DAGTask {

	int id;

	long L;
	long W;

	Node source;
	Node sink;

	List<Node> nodes = new ArrayList<>();
	List<Edge> edges = new ArrayList<>();

	public DAGTask(int id, long L, long W, List<Node> nodes, List<Edge> edges, Node source, Node sink) {
		this.id = id;
		this.L = L;
		this.W = W;
		this.nodes = nodes;
		this.edges = edges;

		this.source = source;
		this.sink = sink;
	}
}

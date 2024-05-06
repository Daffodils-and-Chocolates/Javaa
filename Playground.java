import java.util.*;

public class Playground {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph();
        g.createDefaultGraph();
        System.out.println(g);
        Collections.sort(g.graph);
        System.out.println(g);
    }
}

class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    public int compareTo(Edge s){
        return this.weight - s.weight;
    }
    public String toString(){
        return this.src + " " + this.dest +" " + this.weight;
    }
}

class Graph {
    public static final Scanner sc = new Scanner(System.in);
    ArrayList<Edge> graph;

    Graph() {
        graph = new ArrayList<Edge>();
    }

    void createDefaultGraph(){
        graph.add(new Edge(0,2,2));
    
        graph.add(new Edge(1,2,10));
        graph.add(new Edge(1,3,0));
    
        graph.add(new Edge(2,0,2));
        graph.add(new Edge(2,1,10));
        graph.add(new Edge(2,3,-1));
    
        graph.add(new Edge(3,1,0));
        graph.add(new Edge(3,2,-1));
    }

    void createGraphByInput() {
        System.out.println("Enter number of edges");
        int v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            int dest = sc.nextInt();
            int weight = sc.nextInt();
            graph.add(new Edge(v, dest, weight));
        }
    }

    void kuruksals(){
        int V = graph.size(); // Number of vertices
        Collections.sort(graph); // Sort edges by weight
        int j = 0;
        int noOfEdges = 0;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Edge edge : graph) {
            sb.append(edge.toString()).append("\n");
        }
        return sb.toString();
    }
}
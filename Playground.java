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

    class Subset { 
        int parent, rank; 
        public Subset(int parent, int rank) 
        { 
            this.parent = parent; 
            this.rank = rank; 
        } 
    } 

    void kuruksals(){
        int V = graph.size();
        Collections.sort(graph);
        int j = 0;
        int noOfEdges = 0;
        Subset subsets[] = new Subset[V];

        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset(i, 0);
        }

        Edge results[] = new Edge[V];

        while (noOfEdges < V - 1) {
            Edge nextEdge = graph.get(j);
            int x = findRoot(subsets, nextEdge.src);
            int y = findRoot(subsets, nextEdge.dest);

            if (x != y) {
                results[noOfEdges] = nextEdge;
                union(subsets, x, y);
                noOfEdges++;
            }

            j++;
        }

        System.out.println("Following are the edges of the constructed MST:");
        int minCost = 0;
        for (int i = 0; i < noOfEdges; i++) {
            System.out.println(results[i].src + " -- " + results[i].dest + " == " + results[i].weight);
            minCost += results[i].weight;
        }
        System.out.println("Total cost of MST: " + minCost);
    }

    private void union(Subset[] subsets, int x, int y) {
        int rootX = findRoot(subsets, x);
        int rootY = findRoot(subsets, y);

        if (subsets[rootY].rank < subsets[rootX].rank) {
            subsets[rootY].parent = rootX;
        } else if (subsets[rootX].rank < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        } else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    private int findRoot(Subset[] subsets, int i) {
        if (subsets[i].parent == i)
            return subsets[i].parent;

        subsets[i].parent
            = findRoot(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Edge edge : graph) {
            sb.append(edge.toString()).append("\n");
        }
        return sb.toString();
    }
}
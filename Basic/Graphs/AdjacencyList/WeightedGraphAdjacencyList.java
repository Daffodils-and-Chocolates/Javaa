package Basic.Graphs.AdjacencyList;
import java.util.*;

class Edge{
    int src;
    int dest;
    int weight;

    Edge(int src, int dest,int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
};

public class WeightedGraphAdjacencyList {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
    
        graph[0].add(new Edge(0,2,2));
    
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
    
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
    
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    
    public static void printNeighbours(ArrayList<Edge> graph[], int v){
        for(int i=0; i<graph[v].size() ;i++){
            Edge e = graph[v].get(i);
            System.out.println(e.dest +" "+e.weight);
        }
        System.out.println();
    }

    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        printNeighbours(graph, 0);
        printNeighbours(graph, 1);
        printNeighbours(graph, 2);
        printNeighbours(graph, 3);
    }
}

package Basic.Graphs.AdjacencyMatrix;
import java.util.*;

public class UnWeightedGraphAdjacencyMatrix {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter number of vertices:");
        int v = sc.nextInt();
        int[][] graph = new int[v][v];
        createGraph(graph);
        printGraph(graph);
    }
    static void createGraph(int[][] graph){
        for(int i=0;i<graph.length;i++){
            System.out.printf("Enter number of relations of the %dth node\n", i);
            int r = sc.nextInt();
            for(int j=0;j<r;j++){
                int v = sc.nextInt();
                graph[i][v] = 1;
            }
        }
    }
    static void printGraph(int[][] graph){
        System.out.println(Arrays.deepToString(graph));
    }
}

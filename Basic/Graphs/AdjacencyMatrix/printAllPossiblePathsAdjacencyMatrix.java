package Basic.Graphs.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.Scanner;

class PrintAllPossiblePathsFromSourceToTarget {
    public static void main(String args[]) {
        Graph g = new Graph();
        g.createGraph();
        g.printGraph();
        g.AllPossiblePaths();
    }
}

class Graph {
    Scanner sc = new Scanner(System.in);
    int[][] graph;

    Graph() {
        // System.out.println("Enter number of Vertices : ");
        int v = sc.nextInt();
        graph = new int[v][v];
    }

    void createGraph() {
        for (int i = 0; i < graph.length; i++) {
            // System.out.printf("Enter number of relations of the %dth node\n", i);
            int r = sc.nextInt();
            // System.out.println("Enter all the directly connected nodes: ");
            for (int j = 0; j < r; j++) {
                int v = sc.nextInt();
                graph[i][v] = 1;
            }
        }
    }

    void AllPossiblePaths() {
        ArrayList<Integer> TN = new ArrayList<>();
        int src = sc.nextInt();
        int dest = sc.nextInt();
        TN.add(src);
        possiblePaths(TN, dest);
    }

    void possiblePaths(ArrayList<Integer> TN, int dest) {
        int current = TN.get(TN.size() - 1);
        if (current == dest) {
            System.out.println(TN);
            return;
        }
        for (int i = 0; i < graph[0].length; i++) {
            if (graph[current][i] == 1 && !TN.contains(i)) {
                TN.add(i);
                possiblePaths(TN, dest);
                TN.remove(TN.size() - 1); // Backtrack
            }
        }
        // System.out.print("no Possible path : ");
        // System.out.println(TN);
    }

    void printGraph() {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}

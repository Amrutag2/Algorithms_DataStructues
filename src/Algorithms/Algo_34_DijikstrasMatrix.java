package Algorithms;

import java.util.Arrays;

public class Algo_34_DijikstrasMatrix {
    static final int V = 5;
    int minDistance(int[] dist, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        Algo_34_DijikstrasMatrix dijkstra = new Algo_34_DijikstrasMatrix();
        dijkstra.dijkstra(graph, 0); // Running Dijkstra's algorithm from vertex 0
    }
    void dijkstra(int[][] graph, int src) {
        int[] dist = new int[V]; // Output array. dist[i] holds the shortest distance from src to i
        boolean[] sptSet = new boolean[V]; // sptSet[i] is true if vertex i is included in shortest path tree

        // Initialize all distances as INFINITE and sptSet[] as false
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Find the shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices not yet processed
            int u = minDistance(dist, sptSet);
            sptSet[u] = true; // Mark the picked vertex as processed

            // Update dist value of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print the constructed distance array
        printSolution(dist);
    }
}

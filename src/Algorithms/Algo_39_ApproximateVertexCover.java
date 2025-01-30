package Algorithms;

import java.util.*;

public class Algo_39_ApproximateVertexCover {
    static class Graph {
        int V; // Number of vertices
        List<Integer>[] adj; // Adjacency list

        @SuppressWarnings("unchecked")
        Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }

        void vertexCover() {
            // To keep track of visited vertices
            boolean[] visited = new boolean[V];
            Set<Integer> vertexCover = new HashSet<>();

            // Iterate through all vertices
            for (int u = 0; u < V; u++) {
                if (!visited[u]) {
                    for (int v : adj[u]) {
                        if (!visited[v]) {
                            // Add both u and v to the vertex cover
                            vertexCover.add(u);
                            vertexCover.add(v);

                            // Mark u and v as visited
                            visited[u] = true;
                            visited[v] = true;

                            break; // Move to the next vertex
                        }
                    }
                }
            }

            // Print the approximate vertex cover
            System.out.println("Approximate Vertex Cover:");
            for (int v : vertexCover) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        g.vertexCover();
    }
}


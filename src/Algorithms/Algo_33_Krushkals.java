package Algorithms;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Edge {
    int src, dest, weight;

    public Edge(int src, int dest, int weight)
    {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
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
public class Algo_33_Krushkals {
    static int V = 5;
    static int[] parent = new int[V];
    static int INF = Integer.MAX_VALUE;

    public static void kruskalMST(List<Edge> graphEdge,int V){
        int j = 0,noOfEdges = 0;
        Subset subsets[] = new Subset[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset(i, 0);
        }

        Edge results[] = new Edge[V];
        while(noOfEdges<V-1&& j<V) {
            Edge nextEdge = graphEdge.get(j);
            int x = find(subsets, nextEdge.src);
            int y = find(subsets, nextEdge.dest);
            if (x != y) {
                results[noOfEdges] = nextEdge;
                union(subsets, x, y);
                noOfEdges++;
            }

            j++;

        }
        System.out.println(
                "Following are the edges of the constructed MST:");
        int minCost = 0;
        for (int i = 0; i < noOfEdges; i++) {
            System.out.println(results[i].src + " -- "
                    + results[i].dest + " == "
                    + results[i].weight);
            minCost += results[i].weight;
        }
        System.out.println("Total cost of MST: " + minCost);
    }
    static int find(Subset[] subsets, int i)
    {
        if (subsets[i].parent == i)
            return subsets[i].parent;

        subsets[i].parent
                = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }
    static void union(Subset[] subsets, int x,
                      int y)
    {
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);

        if (subsets[rootY].rank < subsets[rootX].rank) {
            subsets[rootY].parent = rootX;
        }
        else if (subsets[rootX].rank
                < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        }
        else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }
    public static void main(String[] args) {
        List<Edge> graphEdges = new ArrayList<>();

        graphEdges.add(new Edge(0,1,10));
        graphEdges.add(new Edge(0,2,6));
        graphEdges.add(new Edge(0,3,5));
        graphEdges.add(new Edge(2,3,4));
        graphEdges.add(new Edge(1,3,15));
        graphEdges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight-o2.weight;
            }
        });
        kruskalMST(graphEdges,V);
    }


}

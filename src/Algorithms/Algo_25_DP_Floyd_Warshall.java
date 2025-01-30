package Algorithms;

public class Algo_25_DP_Floyd_Warshall {
    public static void main(String[] args) {
        final int INF =99999,V = 4;
        int  i,j,k;
        int graph[][] = {
                {0,5,INF,10},
                {INF,0,3,INF},
                {INF,INF,0,-1},
                {INF,INF,INF,0}
        };
        for (k = 0; k < V; k++) {
            for (i = 0;i < V; i++) {
                for (j = 0;j < V; j++) {
                    if (graph[i][k] != INF && graph[k][j] != INF && graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        System.out.println("the updated graph for single source shortest path is");
        for (int l = 0; l < V; l++) {
            for (int m = 0; m < V; m++) {
                if (graph[l][m] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(graph[l][m] + "   ");
            }
            System.out.println();

        }
        // If distance of any vertex from itself becomes negative, then there is a negative weight cycle.
        boolean cycle = false;
        for (i = 0; i < V; i++)
            if (graph[i][i] < 0)
                cycle=true;
            else cycle=false;

        if(cycle){
            System.out.println("cycle exists");
        }
        else{
            System.out.println("cycle does not exists");

        }
    }
}

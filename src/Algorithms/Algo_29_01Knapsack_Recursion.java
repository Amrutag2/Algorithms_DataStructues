package Algorithms;

public class Algo_29_01Knapsack_Recursion {
    static int knapSack(int W,int[]wt,int[]val,int n){
        if(n==0||W==0){
            return 0;
        }
        if(wt[n-1]>W){
            return knapSack(W,wt,val,n-1);
        }
        else{
            return Math.max(knapSack(W, wt, val, n - 1), val[n - 1] + knapSack(W - wt[n-1], wt, val, n-1));
        }
    }
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));
    }
}

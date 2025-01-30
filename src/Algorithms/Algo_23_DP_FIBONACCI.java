package Algorithms;

public class Algo_23_DP_FIBONACCI {
    public static void Fibonacci(int n){
        int []Array = new int[n];
        for (int i = 0; i <n; i++) {
            if(i==0||i==1){
                Array[i]=i;
                System.out.print(Array[i]+" ");
                continue;
            }
            Array[i] = Array[i-1]+Array[i-2];
            System.out.print(Array[i]+" ");
        }

    }

    public static void main(String[] args) {
        int n = 10;
        Fibonacci(n);
    }
}

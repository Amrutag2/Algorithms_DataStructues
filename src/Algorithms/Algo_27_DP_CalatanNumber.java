package Algorithms;
//c3 = c0c2+c1c1+c2c0
//c4 = c0c3+c1c2+c2c1+c3c0
//c5 = c0c4+c1c3+c2c2+c3c1+c4c0

public class Algo_27_DP_CalatanNumber {
    public static int catalanDP(int n){
        int catalan[] = new int[n+2];
        catalan[0] = 1;
        catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            catalan[i]=0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j]*catalan[i-j-1];
            }

        }
        return catalan[n];
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(catalanDP(i) + " ");
        }
    }
}

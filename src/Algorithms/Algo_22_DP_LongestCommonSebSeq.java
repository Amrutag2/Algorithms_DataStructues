package Algorithms;
//https://www.geeksforgeeks.org/dynamic-programming/
import java.util.Arrays;

public class Algo_22_DP_LongestCommonSebSeq {
    public static int RecursionLongestSubsequence(String str1,String str2, int m, int n , int [][] arr){
        if(m==0||n==0){
            return 0;
        }
        if(arr[m][n]!=-1){
            return arr[m][n];
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return arr[m][n]=1+RecursionLongestSubsequence(str1,str2,m-1,n-1,arr);
        }
        return arr[m][n] = Math.max(RecursionLongestSubsequence(str1,str2,m,n-1,arr),RecursionLongestSubsequence(str1,str2,m-1,n,arr));
    }
    public static int DynamicLongestCommonSubseq(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int arr [][] = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr[m][n];
    }
    public static void main(String[] args) {
        String str1 = "afana";
        String str2 = "maafann";
        int m = str1.length();

        int n = str2.length();
        int arr[][]  = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(arr[i], -1);
        }
        int x = RecursionLongestSubsequence(str1,str2,str1.length(),str2.length(), arr);
        System.out.println(x);

        int y = DynamicLongestCommonSubseq(str1,str2);
        System.out.println(y);
    }
}


package Algorithms;

public class Algo_24_DP_SumOfSubset {
    public static void main(String[] args) {
        int arr[] = {4,2,3,1,7};
        int  n = arr.length;
        int target = 9;
        boolean [][]memo = new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
           for(int j=0;j<=target;j++){
               if(i==0&&j==0){
                    memo[0][0]=true;
               }else if(i==0){
                    memo[0][j]=false;
               }else if(j==0){
                    memo[i][0]=true;
               }else{
                   if(memo[i-1][j]==true){
                       memo[i][j]=true;
                   }
                   else{
                       int value = arr[i-1];
                       if(j>=value){
                           memo[i][j] = (memo[i-1][j-value]||memo[i][j]);
                       }
                        else{
                            memo[i][j] = memo[i-1][j];
                       }
                   }
               }
           }
        }
        System.out.println(memo[arr.length][target]);
    }
}

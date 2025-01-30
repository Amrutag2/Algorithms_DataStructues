package Algorithms;
//count total path in a maze to move from (0,0) to (n,m)
//only teo moves down or right
//used backtracking
public class Algo_8_totalPath_recursion {
    public static int count(int n, int m, int i , int j){
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        //move down
        int downpath = count(n,m,i+1,j);
        int rightpath = count(n,m,i,j+1);
        return downpath+rightpath;
    }
    public static void main(String[]args ){
        System.out.println(count (3,3,0,0));
    }

}

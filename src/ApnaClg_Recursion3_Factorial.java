import javax.imageio.stream.FileCacheImageInputStream;

public class ApnaClg_Recursion3_Factorial {
    public static void Factorial(int i, int n, int fact){
        if(n==i){
            System.out.println(fact);
        }
        else {
            fact *= i;
            Factorial(i+1 ,n,fact);
        }

    }
    public static int Fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else {
            return n*Fact(n-1);
        }
    }

    public static void main(String[] args){
        Factorial(1,7,1);
        System.out.println(Fact(3));
    }
}

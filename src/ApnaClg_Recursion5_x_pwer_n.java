//Print x^n (Stack height = n)

public class ApnaClg_Recursion5_x_pwer_n {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xPowernm1 = power(x,n-1);
        int xPowern = x*xPowernm1;
        return xPowern;
    }

    public static void main(String[] args) {
        int x=2;int n=5;
        System.out.println(power(x,n));

    }
}

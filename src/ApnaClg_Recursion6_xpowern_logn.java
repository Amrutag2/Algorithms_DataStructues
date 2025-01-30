public class ApnaClg_Recursion6_xpowern_logn {
    public static int Power(int x , int n ){
        if (n == 0) {
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2 == 0){
            return Power(x,n/2)*Power(x,n/2);
        }
         else {
            return Power(x,n/2)*x*Power(x,n/2);
        }

    }
    public static void main(String[] args) {
        int x=2;int n =16;
        System.out.println(Power(x,n));
    }
}

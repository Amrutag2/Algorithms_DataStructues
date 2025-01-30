public class ApnaClg_Recursion4_Fibonacci {
    public static int Fib(int n) {
        if(n==0||n==1){
            return n;
        }
        else
            return Fib(n-1)+Fib(n-2);

    }
    public static void Fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        Fibonacci(b,c,n-1);
    }



    public static void main(String[] args) {
        System.out.println(Fib(7));
        int a = 0; int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        Fibonacci(a,b,n-2);
    }
}

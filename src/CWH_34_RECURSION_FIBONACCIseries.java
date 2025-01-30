import java.util.Scanner;

public class CWH_34_RECURSION_FIBONACCIseries {
    static int fib(int x){
        int series = 0;
        if (x==0||x==1){
            return x;
        }
        else {
            return fib(x-1)+fib(x-2);


        }


    }
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate fibnocci series ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Factorial of given number is : "+ fib(a));
    }
}

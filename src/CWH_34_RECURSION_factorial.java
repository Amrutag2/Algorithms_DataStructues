import java.util.Scanner;

public class CWH_34_RECURSION_factorial {
    static int factorial (int x) {
        if (x == 1|| x==0) {
            return  1;
        }
        else {
            return x * factorial(x - 1);
        }
    }
    static int Iteratve_factorial (int x) {
        int product =1;
        if (x == 1|| x==0) {
            return  1;
        }
        else {
            for (int i = 1; i <=x ; i++) {
                product *= i;
            }
            return product;

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to calculate factorial ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Factorial of given number is : "+ factorial(a));
        System.out.println("Iterative Factorial of given number is : "+ Iteratve_factorial(a));

    }
}

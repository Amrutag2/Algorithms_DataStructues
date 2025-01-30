package data_structures;
//1*1*1 + 5*5*5 + 3*3*3 = 153
//1253 is not a Armstrong Number
//1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723
import java.util.Scanner;
public class Number_9_SquareRoot {
    public static double squareRoot(int n ){
        if (n == 1||n==0) {
            return n;
        }
        double t ;
        double squareroot = n/2;
        do {
            t = squareroot;
            squareroot = (t+(n/t))/2;
        }while((t-squareroot)!=0);
        return squareroot;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number you want to find its square Roots");
    int n = sc.nextInt();
        System.out.println("The square root of "+ n+ " is: "+squareRoot(n));
    }
}

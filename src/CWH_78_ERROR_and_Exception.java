import java.util.Scanner;

public class CWH_78_ERROR_and_Exception {
    public static void main(String[] args) {
        //logical error demo
        //Write a program to print all prime numbers between 1 to 10
        //logical error
        System.out.println(2);
        for (int i =1;i<5;i++){
            System.out.println(2*i+1);
        }

        //runtime error(exception)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int j = sc.nextInt();
    }
}

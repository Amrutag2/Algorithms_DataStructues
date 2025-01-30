import java.util.Scanner;
import java.util.Random;

public class CWH_41_EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter Your Choice 0 for Scissor, 1 for Rock , 2 for Paper");
        int n;int m;
        n = input.nextInt();
        m = rd.nextInt(3);
        System.out.println("Computer Choice: "+m);
        if(n == m){
            System.out.println("Draw");
        } else if (n==0 && m==2 || n==1 && m==0||n==2 && m==0) {
            System.out.println("You Won!!");
        }else {
            System.out.println("You Lose");
        }


    }
}

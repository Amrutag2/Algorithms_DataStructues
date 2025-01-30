import java.util.Scanner;

public class CWH_18_switch {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are an adult!!");
                break;
            case 23:
                System.out.println("You are going to join a job!!");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy Your Life");


        }
        System.out.println("Thanks for using my java code");
    }
}

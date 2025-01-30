import java.util.Scanner;

public class CHW_05_Takeinput {
    public static void main(String[] args) {
        System.out.println("it works");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of the numbers is : ");
        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();     to check whether the input is int or not
//        System.out.println(b1);
        String str = sc.next();
        String str1 = sc.nextLine();
        System.out.println(str);
        System.out.println(str1);
    }
}


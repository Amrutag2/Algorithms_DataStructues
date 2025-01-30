import java.util.Scanner;

public class CHW_06_Exercise1 {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of each suubjects out of 100 : ");
        float s1 = sc.nextInt();
        float s2 = sc.nextInt();
        float s3 = sc.nextInt();
        float s4 = sc.nextInt();
        float s5 = sc.nextInt();
        float sum = s1+s2+s3+s4+s5;
        System.out.println(sum);
        float ans = ((sum/500)*100);
        System.out.print("The percentage is :");
        System.out.println(ans);


    }
}

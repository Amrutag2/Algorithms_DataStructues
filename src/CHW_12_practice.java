import java.util.Scanner;

public class CHW_12_practice {
    public static void main(String[] args) {
        float a= 7/4*9/2;
        float b= 7/4.0f*9/2.0f;
        System.out.println(a);
        System.out.println(b);
        //encrpyt
        char grade = 'B';
        grade += 8;    //grade = (char)(grade+8);
        System.out.println(grade);
        //decrypt
        grade -= 8;
        System.out.println(grade);

        //if the number enter is greater then 8
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println(p>8);
        System.out.println(7*49/7+35/7);
    }
}

import java.util.Scanner;
public class CWH_86_ERROR_PRACTISE {
    public static void main(String[] args) {
        //problem 1 - give syntax error
        //int s = 9  syntax  eerror

        //logical error
        //int year_born = 2000-78;

        //problem 2 print haha - Arithmetic exception and hehe - illegalException

        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            try {
                System.out.println(n/m);
            }catch (ArithmeticException e){
                System.out.println("Haha m cannot be zero "+e);
            }
        }catch (IllegalArgumentException e){
            System.out.println("hehe invalid input");
        }

        //PROBLRM 3 - allows you to keep accessing amn array until a valid index is
        // given. if max retries execeed 5 print "errror"

        boolean flag = true;
        int[] Array = {3,4,5,6};
        int i = 0;
        int index;
        while (flag && i<5){
            try {
                System.out.println("enter index");
                index= sc.nextInt();
                System.out.println("the value of marks[index] is "+Array[index]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid index");
                i++;
            }
            if(i>=5){
                System.out.println("Error");
            }
        }

    }
}

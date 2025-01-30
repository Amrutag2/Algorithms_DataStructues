import java.util.Scanner;

public class CWH_81_Specific_Exception {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]=7;
        marks[1]=78;
        marks[2]=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int n = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int m = sc.nextInt();
        try{
            int s = marks[n]/m;
            System.out.println(s);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Exception occured");
            System.out.println(e);
        }
    }
}

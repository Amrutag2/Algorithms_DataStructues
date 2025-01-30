import java.util.Scanner;

public class CWH_82_NESTED_try_catch {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]=7;
        marks[1]=78;
        marks[2]=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER INDEX OF ARRAY");
        int d = sc.nextInt();

        System.out.println("enter the number to divide number in array index ");
        int f = sc.nextInt();

        try{
            int s = marks[d]/f;
            System.out.println(s);
            System.out.println("Welcome to video number 82");
            try {
                System.out.println(marks[d]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("THIS INDEX DOES NOT EXISTS");
                System.out.println("Exception at level 2");
            }
        }catch (Exception e){
            System.out.println("Exception at level 1");
        }
    }
}

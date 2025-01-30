import java.util.Scanner;

public class CWH_82_B_ARRAY_TRYCATCH {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]=7;
        marks[1]=78;
        marks[2]=8;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("ENTER INDEX OF ARRAY");
            int d = sc.nextInt();
            try {
                System.out.println("welcomw to video 82");
                try{
                    System.out.println(marks[d]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exists");
                    System.out.println("Exception at level 2 and program ends");
                    flag = false;
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }


    }
}

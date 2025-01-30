

public class ApnaClg_Recursion1 {
    //Print Numbers from 5 to 1 using recursion
    public static void PrintNumbers(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            PrintNumbers(n - 1);
        }
    }
    //Print Numbers from 1 to 5 using recursion
    public static void Print(int n) {
        if (n < 6) {
            System.out.println(n);
            Print(n + 1);
        } else {
            return;
        }
    }
    public static void main (String [] args){
       PrintNumbers(5);
        Print(1);
    }
}

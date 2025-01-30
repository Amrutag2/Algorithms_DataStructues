package oops;
import data_structures.Banking;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 0000 for ATM mode of Payment");
        System.out.println("Enter 1111 for UPI mode of Payment");
        int x = s.nextInt();
        BankService b1 = new BankService();
        if(x==0000 || x==1111){
            Banking vref = b1.Factory(x);
            vref.payment();

        }
        else{
            System.out.println("Invalid choice");
        }
    }
}




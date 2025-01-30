package data_structures;
import java.util.Scanner;

public class String_6_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Str = sc.next();
        String revStr ="";
        char ch;
        for(int i = 0;i<Str.length();i++){
             ch= Str.charAt(i);
            revStr=ch+revStr;
        }
        System.out.println("Reverse String is : "+revStr);
        if(revStr.equals(Str)){
            System.out.println(" The string is Palindrome");
        }
        else{
            System.out.println(" The string is not Palindrome");

        }
        System.out.println(" The End!!!");

    }

}

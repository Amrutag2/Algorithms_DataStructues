package data_structures;

public class Number_1_palindrome {
    public static void main(String [] args){
        int n = 121;
        int check = n;
        int newN = 0;
        while(n>0){
            int i = n%10;
            newN = newN*10+i;
            n=n/10;
        }
        System.out.println("The new number : "+newN);
        if(check==newN){
            System.out.println("The number is palindrome");

        }
        else {
            System.out.println("The number is not palindrome");
        }

    }
}

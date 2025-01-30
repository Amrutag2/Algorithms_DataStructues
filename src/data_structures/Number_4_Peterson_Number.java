package data_structures;
//145 -> 1!+4!+5! = 145
public class Number_4_Peterson_Number {
    public static int fact(int n){
        int result = 1;
        for (int i = n; i>0 ; i--) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args){
        int n =146;
        int i = n;
        int check=0;
        while (n>0){
            check+=fact(n%10);
            n/=10;
        }
        if(check==i){
            System.out.println("Peterson's Number");
        }
        else {
            System.out.println("Not Peterson's Number");
        }
    }
}

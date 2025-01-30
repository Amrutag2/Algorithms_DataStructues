package data_structures;
//spy number 9 -> square 81 -> 8+1=9
public class Number_3_NeonNumber {
    public static void main(String[] args) {
        int n = 8;
        int s = n*n;
        int i = 0;
        while(s>0){
            i+=(s%10);
            s/=10;
        }
        if(n==i){
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not Neon Number");
        }

    }
}

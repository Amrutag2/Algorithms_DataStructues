package data_structures;

public class Number_7_ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int x = n;
        int newN = 0;
        int check = n;
        int count =  0;
        while(n>0){
            count++;
            n/=10;
        }
        while(x>0){
            int j = x%10;
            int y = 1;
            for (int i = 0; i < count; i++) {
                y *= j;
            }
            newN+=y;
            x/=10;
        }
        System.out.println(newN);

        if(check==newN){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");

        }
    }
}

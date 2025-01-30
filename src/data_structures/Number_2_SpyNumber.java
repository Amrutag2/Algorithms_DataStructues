package data_structures;
//spy number => 1*2*3 == 1+2+3
public class Number_2_SpyNumber {
    public static void main(String[] args){
        int n = 124;
        int  i =n;
        int newMulti = 1;
        int newAdd = 0;
        while(n>0){
            newMulti*=(n%10);
            n/=10;
        }

        while(i>0){
            newAdd+=(i%10);
            i/=10;
        }
        if(newAdd==newMulti){
            System.out.println("Spy Number");
        }
        else{
            System.out.println(" Not Spy Number");
        }
    }
}

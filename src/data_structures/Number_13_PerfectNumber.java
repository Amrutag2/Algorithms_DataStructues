package data_structures;
//factor of 6 = 1,2,3 addition of factor = 1+2+3 = 6
public class Number_13_PerfectNumber {
    public static void main(String[] args){
        int num = 6;
        int sum = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        if(sum == num){
            System.out.println(sum+" is a Perfect Number");
        }
        else{
            System.out.println("It is not a Perfect Number");
        }
    }
}

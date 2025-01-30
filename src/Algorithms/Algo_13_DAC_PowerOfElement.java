package Algorithms;

import java.util.Scanner;


public class Algo_13_DAC_PowerOfElement {
    public static int Power(int base, int exp){
        if(base ==0 || exp==1){
            return base;
        }
        if(exp == 0){
            return 1;
        }
        int S= Power(base,exp/2);
        if(exp%2 ==0){
            return S*S;
        }
        else return base*S*S;


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and Exponential to find power");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(Power(base,exp));
    }

}

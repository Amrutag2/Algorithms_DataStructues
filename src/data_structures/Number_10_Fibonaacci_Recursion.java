package data_structures;

import java.lang.reflect.Field;

public class Number_10_Fibonaacci_Recursion {
    public static int Fib(int i){
        if(i == 0||i==1){
            return i;
        }
        return Fib(i-1)+Fib(i-2);
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(Fib(i));
        }
    }
}

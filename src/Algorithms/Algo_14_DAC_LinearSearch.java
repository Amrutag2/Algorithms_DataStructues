package Algorithms;

import java.util.Scanner;

public class Algo_14_DAC_LinearSearch {
    public static int Linear_Search(int [] Array,int n,int number){
        int i ;
        for ( i = 0; i < n; i++) {
            if(Array[i]==number){
                return i;
            }
        }
        return -1;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] Array={2,3,5,67,5,77,433,24,34,45,456,5664};
        int n = Array.length;
        System.out.println("Enter the element to be Searched using LINEAR SEARCH");
        int number = sc.nextInt();
        int r = Linear_Search(Array,n,number);
        System.out.println("The number is present at index "+r);

    }
}

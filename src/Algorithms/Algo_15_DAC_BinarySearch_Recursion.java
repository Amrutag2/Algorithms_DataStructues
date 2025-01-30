package Algorithms;

import java.util.Scanner;

public class Algo_15_DAC_BinarySearch_Recursion {
    public static int BinarySearch(int[]Array,int i,int j,int x){
        if (j>=i){
            int mid = i+(j-i)/2;
            if(Array[mid]==x){
                return mid;
            }
            if(Array[mid]<x){
                return BinarySearch(Array,mid+1,j,x);
            }
            return BinarySearch(Array,i,mid-1,x);

        }
        return -1;
    }
    public static void main(String[] args) {
        int []Array = {1,2,4,5,6,7,34,56,77,88,89,90,94,99,204,456,5678,566743};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be Serached using Binary Search : ");
        int x = sc.nextInt();
        int result = BinarySearch(Array,0,(Array.length)-1,x);
        if (result >= 0) {
            System.out.println("The Number is prsent at index : "+result);
        }
        else {
            System.out.println("The Number is not prsent in the array");
        }
    }
}

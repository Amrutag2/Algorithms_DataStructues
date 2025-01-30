package Algorithms;

import java.util.Scanner;

public class Algo_16_DAC_BinarySearch_nonRecursion {
    public static int BinarySearch(int[] Array,int i, int j, int x){
        while(i<=j){
            int mid = (j+i)/2;
            if(Array[mid]==x){
                return mid;
            }
            if (Array[mid]>x){
                j = mid-1;
            }
            else {
                i=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] Array={4,6,8,19,78,90,789,6543};
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

package data_structures;

import java.util.Scanner;

public class Array_2_Count_Freq_of_ele {
    static int freq = 0;
    public static void Count(int []arr,int n ,int k){
        int i=0;
        while(i<n){
            if(arr[i]==k){
                freq++;
            }
            i++;
        }

        System.out.println(k+" "+freq);
    }
    public static void main(String[] args) {
        int []Array={20,40,50,20,20,60,70,80,20,32,50,20,45,34,20};
        int n = Array.length;
        System.out.println("Enter element to know its frequency");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Count(Array,n,k);
    }
}

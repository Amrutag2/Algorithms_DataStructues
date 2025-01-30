package data_structures;

import java.util.Scanner;

public class Array_12_MoveZerostoEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the length of your array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of your array : ");
        int [] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i]= sc.nextInt();
        }
        int [] newArray = new int[n];
        int j =0;
        int count = 0 ;
        for (int i = 0; i < n; i++) {
            if(Array[i]==0){
                count++;
                continue;
            }
            else{
              newArray[j++] = Array[i];
            }
        }
        while(count<0){
            newArray[j++]=0;
            count--;
        }
        System.out.println("The updated Array is : ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}

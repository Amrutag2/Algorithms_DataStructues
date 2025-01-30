package Algorithms;
import java.util.Scanner;

public class Algo_11_LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Integer Array");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements of Integer Array");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("The Integer Array is");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+" ");
        }

        System.out.println("=====Linear Search=======");
        System.out.println("Enter the element to be searched");
        int num = sc.nextInt();

        boolean flag = false;
        for(int i =0;i<n;i++){
            if(array[i]==num){
                System.out.println("Integer "+num+" is present in the array");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Not found");
        }
        System.out.println("The End!!!");


    }
}

package data_structures;

import java.util.Scanner;
public class Array_10_PrimeNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int j = 0;j<n;j++){
            for(int num=2;num<array[j];num++){
                if(num==(array[j]-1)){
                    System.out.println("this is prime no : "+array[j]);
                }
                if(array[j]<=2){
                    System.out.println("Nor prime nor non-prime");
                    break;
                }
                if(array[j]%num==0){
                    System.out.println("this is not prime no : "+array[j]);
                    break;
                }
                else{
                    continue;
                }

            }

        }

    }
}
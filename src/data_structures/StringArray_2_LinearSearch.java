package data_structures;
import java.util.Scanner;

public class StringArray_2_LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of String Array");
        int n = sc.nextInt();
        String []Array = new String[n];
        System.out.println("Enter the elements of String Array");

        for(int i =0;i<n;i++){
            Array[i]=sc.next();
        }
        //print array
        System.out.println("The string array is ");
        for(int i =0;i<n;i++){
            System.out.println(Array[i]);
        }
        System.out.println("=========Linear Search=========");
        System.out.println("Enter the element to be searched");
        String str = sc.next();

        boolean flag = false;
        for(int i =0;i<n;i++){
            if(Array[i].equals(str)){
                System.out.println("String "+str+" is present in the array");
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

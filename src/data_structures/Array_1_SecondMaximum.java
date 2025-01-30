package data_structures;
import java.util.Scanner;
public class Array_1_SecondMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array");
        int []Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i]= sc.nextInt();
        }
        int max = Array[0];
        int secondMax = Array[0];
        for (int i = 1; i < n; i++) {
            if(Array[i]>max ){
                secondMax = max;
                max = Array[i];

            }
            if(Array[i]<max &&  Array[i]>secondMax){
                secondMax = Array[i];

            }
        }
        System.out.println("Second Maximum is "+secondMax);
    }
}

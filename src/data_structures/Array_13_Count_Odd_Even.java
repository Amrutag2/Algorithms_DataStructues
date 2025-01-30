package data_structures;
import java.util.Scanner;

public class Array_13_Count_Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of array");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        int [] arr = new int[]{2,3,4,5};
        int [] array = new int[n];
        for(int i = 0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int countOdd=0,countEven=0;
        for(int j=0;j<n;j++){
            if(array[j]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("No of Even numbers in an array"+countEven);
        System.out.println("No of Odd numbers in an array"+countOdd);

    }
}

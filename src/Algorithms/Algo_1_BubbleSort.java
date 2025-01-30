package Algorithms;
//in bubble sort , 1st sort the largest bubble i.e. largest number
//n-1 comparison, worst case =n^2
class BubbleSort{
    public void bubbleSort(int [] arr){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                     temp=arr[j] ;
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }

        }
        printArr (arr);

    }
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Algo_1_BubbleSort {
    public static void main(String[] args) {
    BubbleSort BS = new BubbleSort();
    BS.bubbleSort(new int[]{400,9,8,76,50});
    }
}

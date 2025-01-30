package Algorithms;
class InsertionSort{
    public void insertionSort(int []arr){
//        for (int i = 0;i<arr.length;i++){
//            int current = i;
//            int j =i+1;
//            while (j<arr.length){
//                if(arr[current]>arr[j]){
//                    int temp = arr[j];
//                    arr[j]=arr[current];
//                    arr[current] = temp;
//                }j++;
//            }
//        }

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        printArr(arr);
    }
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}

public class Algo_3_InstertionSort {
    public static void main(String[] args) {
        InsertionSort SS = new InsertionSort();
        SS.insertionSort(new int[]{400,7,8,76,50,1});
    }
}

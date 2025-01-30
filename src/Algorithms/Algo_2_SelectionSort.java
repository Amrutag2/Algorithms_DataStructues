
package Algorithms;
//in selection sort , 1st sort the smallest elemment i.e. smallest number
//n-1 comparison, worst case = O(n^2){ap series}
class SelectionSort{
    public void selectionSort(int [] arr){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small=j;
                }
            }
            temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;

        }
        printArr (arr);

    }
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Algo_2_SelectionSort  {
    public static void main(String[] args) {
        SelectionSort SS = new SelectionSort();
        SS.selectionSort(new int[]{6,400,9,8,76,50});
    }
}


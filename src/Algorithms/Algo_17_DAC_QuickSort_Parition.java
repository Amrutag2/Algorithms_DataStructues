package Algorithms;

public class Algo_17_DAC_QuickSort_Parition {

    public static void Swap(int[] Array,int p,int q){
        int temp = Array[p];
        Array[p] = Array[q];
        Array[q] = temp;
    }
    public static int Partiton(int [] Array,int p,int q){
        int x = Array[p];
        int i=p;
        for (int j=p+1;j<=q;j++){
            if(Array[j]<=x){
                i++;
                Swap(Array,i,j);
            }
        }
        Swap(Array,i,p);
        return i;
    }
    public static void QuickSort(int[] Array,int p, int q){

        if(p<=q){
            int mid = Partiton(Array,p,q);
            QuickSort(Array,p,mid-1);
            QuickSort(Array,mid+1,q);
        }
    }
    public static void printArr(int[] Array)
    {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int []Array={40,50,30,20,5,10,60};
        QuickSort(Array,0,Array.length-1);
        System.out.println("Sorted array:");
        printArr(Array);
    }
}

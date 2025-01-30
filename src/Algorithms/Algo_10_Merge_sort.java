package Algorithms;

public class Algo_10_Merge_sort {
    public static void conquer(int []Arr,int si , int mid, int ei){
       int []merger= new int[ei-si+1];

       int idx1 = si;
       int idx2 = mid+1;
       int x=0;//index to merger array

        while(idx1<=mid && idx2<=ei){
            if (Arr[idx1]<=Arr[idx2]){
                merger[x]=Arr[idx1];
                x++;idx1++;
            }
            else {
                merger[x]=Arr[idx2];
                x++;idx2++;
            }
        }
        while (idx1<=mid){
            merger[x]=Arr[idx1];
            x++;idx1++;
        }
        while (idx2<=ei){
            merger[x]=Arr[idx2];
            x++;idx2++;
        }

        for (int i =0,j=si;i<=merger.length;i++,j++){
            Arr[j]=merger[i];
        }

    }
    public static void divide(int []Arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (ei+si)/2; //(si+ei)/2;

        divide(Arr,si, mid);
        divide(Arr,mid+1, ei);
        conquer(Arr,si,mid,ei);
    }
    public static void main(String[] args) {
        //unsorted 6,3,9,5,2,8
        //sorted 2,3,5,6,8,9
        int [] Arr = {4,7,2,5,1,3};
        int n = Arr.length;
        divide(Arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]+" ");
        }
        System.out.println();

    }
}

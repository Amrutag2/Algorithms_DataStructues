package Algorithms;
//Merge sort - sorted Array -> merging two sorted Arrays
public class Algo_18_MergeSort {

    public static void merge(int[] Ar,int i, int mid, int j){
        int start2 = mid + 1;
        while(i<=mid){
            if(Ar[i]<=Ar[start2]){
                i++;
            }
            else{
                int temp = Ar[i];
                Ar[i]=Ar[start2];
                Ar[start2]=temp;

                int index = start2;
                while(index<j){

                    if(Ar[index]>Ar[index+1]){
                        int temp1 = Ar[index];
                        Ar[index]= Ar[index+1];
                        Ar[index+1]=temp1;
                        index++;
                    }
                    else{
                        index++;
                    }
                }
                i++;


            }
        }


    }

    public static void Inplace_MergeSort(int[] Ar4 , int i, int j){
       if(i<j){
           int mid = (i+j)/2;
           Inplace_MergeSort(Ar4,i,mid-1);
           Inplace_MergeSort(Ar4,mid+1,j);
           merge(Ar4,i,mid,j);

       }

    }
    public static void Outplace_MergeSort(int []Ar1,int []Ar2,int n,int m){
        int []Ar3 = new int[m+n];
        int i1 =0, j1 = n-1;
        int i2 =0, j2 = m-1;
        int i = 0, j=m+n-1;
        while(i2<=j2 && i1<=j1){
            if(Ar1[i1]>Ar2[i2]){
                Ar3[i++]=Ar2[i2++];
                System.out.println("checkde"+Ar2[i2-1]+" i = "+i);
            }else {
                Ar3[i++]=Ar1[i1++];
                System.out.println("checked "+Ar1[i1-1]+" i = "+i);

            }
        }
//        System.out.println("i1 "+i1);
//        System.out.println("j1 "+j1);
//        System.out.println("i2 "+i2);
//        System.out.println("j2 "+j2);
//        System.out.println("i "+i);
//        System.out.println("j "+j);

        if(i2>j2){
            for (int x =i;x<=j;x++){
                Ar3[x]= Ar1[i1++];
                if(i1>j1){
                    break;
                }
            }
        }
        else{
            for (int x = i;x<=j;x++){
                Ar3[x]= Ar2[i2++];
                if(i2>j2){
                    break;
                }
            }
        }
        System.out.println("outplace sorted");
        for (int k = 0; k <= j; k++) {
            System.out.println(Ar3[k]);
        }
    }

    public static void main(String []args ){
        //OutPlace MergeSort
        System.out.println("=======OutPlace MergeSort========");
        int[] Ar1 = {5,10,13};
        int  n = Ar1.length;
        int[] Ar2= {9,11,14,15};
        int m = Ar2.length;

        Outplace_MergeSort(Ar1,Ar2,n,m);

        //Inplace MergeSort
        System.out.println("=======InPlace MergeSort========");
        int[] Ar4= {10,20,30,40,11,21,31,41};
        Inplace_MergeSort(Ar4,0,Ar4.length-1);
        for (int k = 0; k < Ar4.length; k++) {
            System.out.print(Ar4[k]+" ");
        }

    }

}

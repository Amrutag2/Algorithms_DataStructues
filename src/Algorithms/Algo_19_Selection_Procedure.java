package Algorithms;

public class Algo_19_Selection_Procedure {
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
    public static int Selection_Pro(int[] Arr,int i,int j, int k){
        if(i==j){
            return Arr[i];
        }
        else{
           int m = Partiton(Arr,i,j);
            if(m==k){
                return Arr[k];
            }else {
                if(m>k){
                    return Selection_Pro(Arr,i,m-1,k);
                }
                else {
                    return Selection_Pro(Arr,m+1,j,k);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] Array = {2,3,45,24,23,46,47,22,12,5,15,27};
        int  k  = 4; //4th smallest integer
        System.out.println("Element found at "+Selection_Pro(Array,0,Array.length-1,k-1));
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");
        }
    }
}

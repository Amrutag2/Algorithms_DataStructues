package Algorithms;

//in decreasing order all the pairs are inversion that is the array is not sorted
public class Algo_20_Counting_Inversion {
    public static int CountAndMerge(int []Array,int i,int m, int j){
        int res= 0;
        //counts in two subArrays
        int n1 = m-i+1,n2 = j-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int x = 0; x < n1; x++) {
            left[x] = Array[x+1];
        }
        for (int y = 0; y < n2; y++) {
            right[y] = Array[m+1+y];
        }
        int i1 = 0,j1=0,k1=i;
        while(i1<n1&&j1<n2){
            if(left[i1]<=right[j1]){
                Array[k1++] = left[i1++];
            }else {
                Array[k1++] = right[j1++];
                res+=(n1-i1);

            }

        }
        while (i1 < n1)
            Array[k1++] = left[i1++];
        while (j1 < n2)
            Array[k1++] = right[j1++];

        return res;

    }

    public static int CountInv(int[] Array,int i, int j){
        int res=0;
//        if(j==0){
//            return 0;
//        }
        if(i<j){
            int mid = (i+j)/2;
            res+=CountInv(Array,i,mid);
            res+=CountInv(Array,mid+1,j);
            res+= CountAndMerge(Array,i,mid,j);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] Array = { 4, 3, 2, 1 };
        int n = Array.length;
        System.out.println(CountInv(Array,0,n-1));

    }
}

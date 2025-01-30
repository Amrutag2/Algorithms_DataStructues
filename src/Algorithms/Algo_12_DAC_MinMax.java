package Algorithms;

 class MinMax {
    int max;
    int min;
    public MinMax(int min,int max){
        this.max=max;
        this.min=min;


    }
}
class Algo_12_DAC_MinMax{

    public static void Min_MAX(int[]Array,int start,int last, MinMax MxMn){

        if(start == last){
             if(MxMn.max<Array[start]){
                 MxMn.max = Array[start];
             }
             if (MxMn.min>Array[start]){
                 MxMn.min=Array[start];
             }
             return;
        }
        else if(start == last-1){
            if(Array[start]>Array[last]){
                if(Array[start]> MxMn.max){
                    MxMn.max = Array[start];
                }
                if(Array[last]< MxMn.min){
                    MxMn.min = Array[last];
                }
            }
            else {
                if(Array[last]> MxMn.max){
                    MxMn.max = Array[last];
                }
                if(Array[start]< MxMn.min){
                    MxMn.min = Array[start];
                }
            }
            return;

        }

        int mid = (start+last)/2;
        Min_MAX(Array,start,mid,MxMn);
        Min_MAX(Array,mid+1,last,MxMn);

    }

    public static void main(String[] args){
        int []Array={2,50,97,45,33,44,22,33};
        int n = Array.length;
        MinMax MxMn = new MinMax(Array[0],Array[0]);
        Min_MAX(Array,0,n-1,MxMn);
        System.out.println("max = "+MxMn.max);
        System.out.println("min = "+MxMn.min);

    }
}

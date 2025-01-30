package Algorithms;
class ItemValue{
    int weight;
    int profit;
    ItemValue(int w, int p){
        this.weight=w;
        this.profit=p;
    }
}

public class Algo_28_Greedy_FractionalKnapSack {
    static int getMaxFrction(double[]frac){
        double max=frac[0];
        int maxind =0;
        for (int i = 0; i < frac.length; i++) {
            if(frac[i]>max){
                max=frac[i];
                maxind=i;
            }
        }

        return maxind;
    }


    static double getMaxProfit(ItemValue []arr, int capacity){

        double[] frac= new double[arr.length];
        for(int i=0;i<arr.length;i++){
            frac[i]=(float)arr[i].profit/arr[i].weight;
            System.out.println(frac[i]);
        }
        double maxProfit = 0;
        int i=0;
        while(i < arr.length) {
             i= getMaxFrction(frac);
            frac[i]=0;
            if (capacity >= arr[i].weight) {
                maxProfit += arr[i].profit;
                capacity -= arr[i].weight;
            } else{
                double cap = (double) (capacity)/arr[i].weight;
                maxProfit += cap*arr[i].profit;
                break;
            }
        }

        return maxProfit;

    }
    public static void main(String[] args) {
        ItemValue []arr = {
               new ItemValue(10,60),
                new ItemValue(20,100),
                new ItemValue(30,120),
        };
        int capacity = 50;
        double maxProfit = getMaxProfit(arr,capacity);
        System.out.println(maxProfit);
    }
}

//check if an array is strictly increasing
//o(n) time complexity
public class ApnaClg_Recursion8_sorted_strictincre {
    public static boolean isSorted(int [] Arr, int index){
        if(index == Arr.length-1){
            return true;
        }
        if (Arr[index]<=Arr[index+1]) {
            return isSorted(Arr, index+1);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int Arr[] = {5,7,7,9};
        System.out.println(isSorted(Arr,0));
    }
}

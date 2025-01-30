package data_structures;

public class Array_16_Reverse_an_array {
    public static void main(String[] args) {
        int[] array={2,4,3,6,7,20};
        int n = array.length;
        for (int i = 0; i <n/2 ; i++) {
            int temp = array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");

        }
    }
}

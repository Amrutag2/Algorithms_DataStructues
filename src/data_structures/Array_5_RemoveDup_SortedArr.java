package data_structures;

public class Array_5_RemoveDup_SortedArr {
    public static void main(String[] args)
    {
        int []arr = {1,4,5,6,6,7,8,9,9,9,20,21};
        int count;
        for(int i =0;i< arr.length;i=i+count){
            count=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
                else {
                    System.out.println(arr[i]);
                    break;
                }
            }
            if(i==arr.length-1){
                System.out.println(arr[i]);
            }

        }
    }
}

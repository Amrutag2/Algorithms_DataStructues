package data_structures;

public class Array_11_CountDuplicates_Array{
    public static void main(String[] args){

        int []arr={1,2,3,4,3,1,4,5,1,2};
        int a = arr.length;
        int[]new_array = new int[a];
        int k=0;
        for(int i=0;i<a;i++){
            int count = 0;
            for(int j =0;j<=i;j++)
            {
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count==1){
                new_array[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            int count =0;
            for(int j=0;j<a;j++)
            {
                if(new_array[i]==arr[j]){
                    count++;
                }

            }
            System.out.println(new_array[i]+" occurs "+count+" times");
        }

    }
}
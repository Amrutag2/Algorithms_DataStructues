package data_structures;

public class Array_11_CountDuplicates_String {

    public static void main(String[] args){
        String str = "aabbssshhgggg";
        String str_new = "";
        int count,prev=0;
        int a = str.length();
        for(int i = 0;i<a;i=i+prev){
            count = 1;
            for(int j=i+1;j<a;j++)
            {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            prev =count;
            str_new = str_new+str.charAt(i)+""+count;

        }
        System.out.println(str_new);
    }
}
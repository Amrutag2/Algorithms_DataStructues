package data_structures;

public class String_5_Reverse_a_String {
    //using Recursion
    public static void RevString(String Arr, int l){
        if(l<=0){
            return;
        }
        char c  = Arr.charAt(l-1);
        System.out.println(c);
        RevString(Arr, l-1);

    }
    public static void main(String[] args) {
        StringBuilder  Str = new StringBuilder("Beautiful");
        int l = Str.length();
        for (int i =0;i<l/2;i++){
            int front = i; int back = l-i-1;
            char frontchar  =  Str.charAt(front);
            char backchar  =  Str.charAt(back);
           Str.setCharAt(front,backchar);
           Str.setCharAt(back, frontchar);

        }
        System.out.println(Str);

        //recursion
        String Amu = "Amruta";
        RevString(Amu, Amu.length());
    }

}

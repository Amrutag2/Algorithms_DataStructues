package Algorithms;
//backtracking used

public class Algo_7_Permutation_recursion {
    public static void Permut(String str,  String permut){
        if(str.length()==0){
            System.out.println(permut);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            Permut(newStr,permut+ch);
        }
    }
    public static void main(String [] args){
        Permut("abc","");
        String st ="abc";
        System.out.println(st.substring(2));
    }



}

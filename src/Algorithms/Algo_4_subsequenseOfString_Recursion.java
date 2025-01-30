package Algorithms;
//"abc" = abc,ac,ab,bc,a,b,c
public class Algo_4_subsequenseOfString_Recursion {
    public static void subSequence(String Str, int index, String newString){
        if(index == Str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = Str.charAt(index);
        subSequence(Str,index+1, newString+currchar);
        subSequence(Str,index+1, newString);
    }

    public static void main(String[] args) {
        subSequence("abcd",0,"");

    }
}

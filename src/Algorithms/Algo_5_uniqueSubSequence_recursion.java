package Algorithms;

import java.util.HashSet;

public class Algo_5_uniqueSubSequence_recursion {
    public static void subSequence(String Str, int index, String newString, HashSet<String> set){
        if(index == Str.length()){
            if(set.contains((newString))){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar = Str.charAt(index);
        subSequence(Str,index+1, newString+currchar,set);
        subSequence(Str,index+1, newString,set);
    }
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        subSequence("aaa",0,"",set);

    }
}

package data_structures;

import java.util.Arrays;

public class String_4_Anagram {
    public static void main(String[] args) {
        String Str = new String("Amruta");
        String Str2 = new String("Amtaru");
        String NewStr  = new String(Str.toLowerCase());
        String NewStr2  = new String(Str2.toLowerCase());
        if(NewStr.length() == NewStr2.length()) {

            char[] Array = NewStr.toCharArray();
            char[] Array2 = NewStr2.toCharArray();

            Arrays.sort(Array);
            Arrays.sort(Array2);

            boolean results = Arrays.equals(Array, Array2);
            if (results) {
                System.out.println("equal strings are anagram");
            } else {
                System.out.println("not anagram");
            }
        }
        else {
                System.out.println("not anagram");
        }

    }
}

//Another Method

//
//
//public static String sortString(String str) {
//    // Convert the string to a char array
//    char[] charArray = str.toCharArray();
//
//    // Implement Bubble Sort on the char array
//    int n = charArray.length;
//    for (int i = 0; i < n - 1; i++) {
//        for (int j = 0; j < n - i - 1; j++) {
//            // Compare adjacent characters and swap if necessary
//            if (charArray[j] > charArray[j + 1]) {
//                // Swap the characters
//                char temp = charArray[j];
//                charArray[j] = charArray[j + 1];
//                charArray[j + 1] = temp;
//            }
//        }
//    }
//
//    // Convert the sorted char array back to a string and return
//    return new String(charArray);
//}
//
//
//static boolean isAnagram(String a, String b) {
//    // Complete the function
//    a=a.toLowerCase();
//    b=b.toLowerCase();
//    String x=sortString(a);
//    String y=sortString(b);
//    boolean flag=false;
//    if(a.length()!=b.length()){
//        return false;
//    }else{
//        for(int i=0;i<a.length();i++){
//            if (x.charAt(i)==y.charAt(i)) {
//                flag=true;
//
//            }else{flag=false;break;}
//        }
//    }
//
//    return flag;
//}
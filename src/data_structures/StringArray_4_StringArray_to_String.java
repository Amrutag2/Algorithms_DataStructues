package data_structures;

import java.util.Arrays;

public class StringArray_4_StringArray_to_String {
    public static void main(String[] args){
        String []Array = new String[]{"My","name","is","Amruta","Gulekar"};

        StringBuilder sb = new StringBuilder();
        sb.append(Array[0]);
        for (int i = 0; i < Array.length; i++) {
            sb.append(" "+Array[i]);
        }
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);

    }
}

package data_structures;

import java.util.Arrays;

public class StringArray_3_inbuiltSort {
    public static void main(String[] args){
        String [] array = new String[]{"apple","banana","grapes","cadbury","dairy","elephant"};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String s = Arrays.toString(array);
        System.out.println(s);

    }
}

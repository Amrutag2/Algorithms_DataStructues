package Algorithms;

public class Algo_6_Keypad_Combination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int index, String combination){
        if (index==str.length()){
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(index);
        String mapping = keypad[currchar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str,index+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printComb("23",0,"");
    }
}

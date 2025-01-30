package data_structures;

public class Stack_2_ReverseString {
    private char[] array;
    private int top;
    public Stack_2_ReverseString(){
        top=0;
        array = new char[200];
    }
    public char pop(){

        top--;
        char ch = array[top];
        System.out.println("poped " + ch);
        return  ch;
    }
    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        else {
            return false;
        }
    }
    public void push(char ch){
        array[top++]=ch;
        System.out.println("Pushed "+ch);

    }

    public static boolean CheckReverse(String str){
        Stack_2_ReverseString stk = new Stack_2_ReverseString();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stk.push(ch);
        }
        if(stk.isEmpty()){
            return false;
        }

        String newStr="";
        while(stk.top>0) {
            newStr += stk.pop();
        }

        if(newStr.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "malayalam";

        if(CheckReverse(str)){
            System.out.println("Palindrone");
        }
        else{
            System.out.println("Not palindrone");
        }
    }
}

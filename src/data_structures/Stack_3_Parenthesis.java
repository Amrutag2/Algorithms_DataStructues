package data_structures;

public class Stack_3_Parenthesis {
    private char[] array;
    private int top;
    public Stack_3_Parenthesis(){
        array = new char[200];
        top=0;

    }
    public void push(char ch){
        array[top++]=ch;
        System.out.println("elemt pushed" + ch);
        System.out.println("top = "+top);

    }
    public char pop(){
        top--;
        System.out.println("poped" + array[top]);
        return array[top];


    }
    public boolean isEmpty(){
        if(top==0){
            System.out.println("empty");
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean CheckParenthesis(String expr){
        Stack_3_Parenthesis stck = new Stack_3_Parenthesis();
        for(int i=0;i<expr.length();i++){
            char ch = expr.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stck.push(ch);

                continue;
            }
            if(!stck.isEmpty()){
                return false;
            }
            char check;

            switch (ch){
                case ')' :
                    check = stck.pop();

                    if(check=='{'||check=='['){
                        return false;
                    }break;
                case ']' :
                    check = stck.pop();

                    if(check=='{'||check=='('){
                        return false;
                    }break;

                case '}' :
                    check = stck.pop();

                    if(check=='('||check=='['){
                        return false;
                    }break;

            }
        }
        return (stck.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "{[()](())[]}";

        if(!CheckParenthesis(expr)){
            System.out.println("The Expression is balanced");
        }
        else {
            System.out.println("The Expression is not balanced");

        }
    }
}

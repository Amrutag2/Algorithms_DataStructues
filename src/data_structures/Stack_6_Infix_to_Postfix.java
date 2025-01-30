package data_structures;
import java.util.Stack;
public class Stack_6_Infix_to_Postfix {


    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; // Default to left-associative
    }

    public static void InfixToPostfix(String exp){
        Stack<Character> stk = new Stack<>();
        StringBuilder NewExp = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                System.out.println("append "+c);
                NewExp.append(c);
            }
            else if(c=='('){
                System.out.println("pushed "+c);

                stk.push(c);
            }
            else if(c==')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    char s = stk.pop();
                    NewExp.append(s);
                    System.out.println("popped "+s);
                }
                stk.pop();
                System.out.println("popped "+'(');

            }
            else{
                while(!stk.isEmpty()&& (prec(c)<= prec(stk.peek())) && associativity(c) == 'L') {
                    char s = stk.pop();
                    NewExp.append(s);
                    System.out.println("popped "+s);
                }
                System.out.println("pushed "+c);
                stk.push(c);
            }

        }
        while (!stk.isEmpty()) {
            char s = stk.pop();
            NewExp.append(s);
            System.out.println("popped "+s);
        }

        System.out.println(NewExp);

    }
    public static void main(String[] args) {
        String exp = "a+(b*c)";//abc*+
        InfixToPostfix(exp);

    }
}

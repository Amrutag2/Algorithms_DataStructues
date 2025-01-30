package data_structures;

public class Stack_4_Postfix_Evaluation {
    private int []Array;
    private int top;
    public Stack_4_Postfix_Evaluation(){
        this.top = 0;
        Array = new int[200];
    }
    public int pop(){
        top--;
        int e = Array[top];
        System.out.println("element is poped  "+e);
        Array[top]=0;
        return e;

    }
    public void push(int e){
        Array[top]=e;
        System.out.println("element is pushed "+e);
        top++;
    }
    public boolean isEmpty(){
        if(top>0){
            return false;
        }
        return true;
    }
    public static int PostFix_Evaluate(String exp){
        Stack_4_Postfix_Evaluation stk = new Stack_4_Postfix_Evaluation();
        for (int i = 0; i < exp.length(); i++) {
            char ch =exp.charAt(i);
            if(Character.isDigit(ch)){
                stk.push(ch-'0');
            }
            else{
                int val1 = stk.pop();
                int val2 = stk.pop();
                switch (ch){
                    case '+' : stk.push(val2+val1);break;
                    case '*' : stk.push(val2*val1);break;
                    case '-' : stk.push(val2-val1);break;
                    case '/' : stk.push(val2/val1);break;
                    case '%' : stk.push(val2%val1);break;

                }
            }
        }
        return stk.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("The PostFix Evaluation is : "+PostFix_Evaluate(exp));
    }
}

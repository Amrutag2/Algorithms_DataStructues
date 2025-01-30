package data_structures;

public class Stack_1_StackUsingArray {
    private int[] array;
    private int top;
    public Stack_1_StackUsingArray(){
        array = new int[128];
        top=0;

    }
    public void push(int x){
        if(top>array.length){
            System.out.println("Stack Overflow");
        }
        array[top]=x;
        System.out.println("Pushed element is "+array[top]);
        top++;

    }

    public void pop(){

        if(top>0){
            top--;
            System.out.println("The element to be poped is "+array[top]);
            array[top]=0;
        }
        else{
            System.out.println("Stack Underflow");
        }

    }
    public void peek(){
        if(top>0){
            System.out.println("peek is "+array[top-1]);
        }
        else{
            System.out.println("Stack Underflow");
        }
    }

    public void isEmpty(){
        if(top==0){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack is Not Empty");

        }
    }
    public void size(){
        System.out.println("Size of Stack is "+top);
    }
    public void clear(){
        {top=0;}

    }
    public void displayStack(){
        int x = top;
        for(int i = x-1;i>=0;i--){
            System.out.println( "The Elements of an array are : "+array[i]);
        }
        // if(x==0){
        //     System.out.println("Stack Underflow");
        // }
        // else{

        // }
    }
    public static void main(String[] args) {
        Stack_1_StackUsingArray stk = new Stack_1_StackUsingArray();
        stk.push(7);
        stk.push(3);
        stk.push(76);
        stk.pop();
        stk.peek();
        stk.size();
        // stk.clear();
        stk.isEmpty();
        stk.displayStack();
    }
}

package oops;

public class Data4<N,E> {
    public<N extends Number,E extends String> void display(N num, E str){
        System.out.print("Number = "+num);
        System.out.println(" Element = "+str);

    }
}

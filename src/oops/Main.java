package oops;
import data_structures.Data;
public class Main {
    public static void main(String[] args) {
        Data d1 = ( a, b)->{
            System.out.println("valye of y :"+a);
            System.out.println("valye of x :");
            return b;

        };
        System.out.println(d1.demo(2,3)) ;

    }
}

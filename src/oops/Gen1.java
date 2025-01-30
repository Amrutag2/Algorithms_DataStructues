package oops;
import oops.Generics;
public class Gen1 {
    public static void main(String[] args) {
        Generics<String> d1 = new Generics<>("Amu");
        String x = d1.getData();
        System.out.println(d1.getData());
        System.out.println(x);
        Generics<Integer> d2 = new Generics<>(78);
        int y = d2.getData();
        System.out.println(d2.getData());
        System.out.println(y);

        Generics<Double> d3 = new Generics<>(78.5363738);
        double z = d3.getData();
        System.out.println(d3.getData());
        System.out.println(z);
    }
}

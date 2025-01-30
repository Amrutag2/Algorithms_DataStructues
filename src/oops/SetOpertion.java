package oops;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOpertion {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(67);
        s1.add(90);
        s1.add(23);
        s1.add(34);
        s1.add(56);

        Set<String> s2 = new HashSet<>();
        s2.add("Amu");
        s2.add("Amu");
        s2.add("Isha");
        s2.add("Hello");
        s2.add("Tiger");

        System.out.println(s1);
        System.out.println(s2);
        for(String data:s2){
            System.out.println(data);

        }
        for(Integer data:s1){
            System.out.println(data);
        }


        Set<Float> s3 = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            s3.add((float)i);
        }
        System.out.println(s3);
        for(Float data:s3){
            System.out.println(data);
        }


        Set<String> s4 = new TreeSet<>();
        for (int i = 20; i > 10; i--) {
            s4.add("A"+i);
        }
        System.out.println(s4);
        for(String data:s4){
            System.out.println(data);

        }
    }
}

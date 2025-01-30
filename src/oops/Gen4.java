package oops;

import java.util.ArrayList;
import java.util.List;

public class Gen4 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(34);
        l1.add(400);
        l1.add(364);
        l1.add(340);
        new Data2().printlistData(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("Amu");
        l2.add("Athu");
        l2.add("Siddhi");
        l2.add("Samir");
        new Data2().printlistData(l2);

    }
}

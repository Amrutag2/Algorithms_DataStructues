import java.util.*;
public class CWH_93_ARRAYDEQUE {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(7);
        l1.add(37);
        l1.add(47);
        l1.add(57);
        l1.addFirst(5);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
}

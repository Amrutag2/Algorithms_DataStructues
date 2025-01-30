import java.util.*;

public class CWH_92_LINKEDLIST {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(5);
        l2.add(80);
        l2.add(60);
        l2.add(50);
        //l1.clear();
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(l2);
        l1.set(2,10);
        l1.addLast(6);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }

        System.out.println(l1.contains(8));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(5));
    }
}

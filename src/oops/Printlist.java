package oops;

import java.util.*;

public class Printlist {
    public static void main(String[] args) {
        LinkedList<String> List1 = new LinkedList<>();
        List1.add("Study");
        List1.add("Hello");
        List1.add("Good Morning");

        ArrayList<String> List2 = new ArrayList<>();
        List2.add("Good day");
        List2.add("Sir");
        List2.add("Nigth");
        System.out.println("====without iterator=====list1 ");
        new Printlist().printlst(List1);
        System.out.println("====without iterator=====list2 ");
        new Printlist().printlst(List2);
        System.out.println("====Collection.sort()=====list1 ");
        Collections.sort(List1);
        new Printlist().printlst(List1);
        System.out.println("====with iterator=====list1 ");
        new Printlist().printIterator(List2);
    }
    void printlst(List<String> l1){
        for(String temp:l1){
            System.out.println(temp);
        }
    }
    void printIterator(List<String> l1){
        Iterator<String> data = l1.listIterator();
        while(data.hasNext()){
            System.out.println(data.next());

        }
    }
}


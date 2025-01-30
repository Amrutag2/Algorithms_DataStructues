package PriorityQ_DynamicProg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MinHeap_PriorityQ {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> Prqu = new PriorityQueue<Integer>();
        Prqu.add(10);
        Prqu.add(300);
        Prqu.add(20);
        Prqu.add(250);Prqu.add(90);
        Prqu.add(280);
        Prqu.add(23);
        Prqu.add(400);

        System.out.println("Head value using peek function:"
                + Prqu.peek());
        System.out.println("The queue elemnets are : ");
        Iterator<Integer> itr = Prqu.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("removal");
        // Removing the top priority element (or head) and
        // printing the modified pQueue using poll()
        System.out.println(Prqu.poll());
        System.out.println(Prqu.poll());
        System.out.println(Prqu.poll());
        System.out.println(Prqu.poll());System.out.println(Prqu.poll());
        System.out.println(Prqu.poll());
        System.out.println(Prqu.poll());
        System.out.println(Prqu.poll());

//
//        System.out.println("After removing an element with poll function:");
//        Iterator<Integer> itr2 = Prqu.iterator();
//
//        while (itr2.hasNext())
//            System.out.println(itr2.next());
//
//
//        Prqu.remove(23);
//
//        System.out.println("after removing 23 with"
//                + " remove function:");
//
//        // Again creati ng iterator object
//        Iterator<Integer> itr3 = Prqu.iterator();
//        while (itr3.hasNext())
//            System.out.println(itr3.next());
//
//        boolean b = Prqu.contains(20);
//        System.out.println("Priority queue contains 20 "
//                + "or not?: " + b);
//
//        // Getting objects from the queue using toArray()
//        // in an array and print the array
//        Object[] arr = Prqu.toArray();
//
//        System.out.println("Value in array: ");
//
//        for (int i = 0; i < arr.length; i++)
//            System.out.println("Value: "
//                    + arr[i].toString());
    }
}

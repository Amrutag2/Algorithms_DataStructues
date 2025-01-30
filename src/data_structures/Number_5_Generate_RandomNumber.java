package data_structures;
//https://www.javatpoint.com/how-to-generate-random-number-in-java
//Using the random() Method
//Using the Random Class-->java.lang.Random
//Using the ThreadLocalRandom Class --> java.util.concurrent
//Using the ints() Method (in Java 8)

import java.util.concurrent.*;
import java.util.Random;

public class Number_5_Generate_RandomNumber {
    public static void randomInts(int num)
    {
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }
    public static void randomInts(int num, int origin, int bound)
    {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }
    public static void main(String[] args) {
        //without Range
        double n = Math.random();
        System.out.println(n);
        //With Range
        int max = 6;
        int min = 1;
        int n2 = (int)(Math.random()*(max-min+1)+min) ;//(int)Math.random gives value zero
        System.out.println(n2);
        //using Random Class - create oject invoke nextInt()
        Random rd = new Random();
        // Generates random integers 0 to 49
        int x = rd.nextInt(50);
        System.out.println(x);

        //using ThreadLocalRandom
        //0 inclusive and specified bound exclusive
        int a = ThreadLocalRandom.current().nextInt(0,7);
        System.out.println(a);
        double c = ThreadLocalRandom.current().nextDouble(1,2);
        System.out.println(c);
        boolean e = ThreadLocalRandom.current().nextBoolean();
        System.out.println(e);

        //using ints
        randomInts(5);
        randomInts(9, 50, 90);
    }
}

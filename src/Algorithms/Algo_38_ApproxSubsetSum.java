package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Algo_38_ApproxSubsetSum {
    public static ArrayList<Long> mergeAndTrim(ArrayList<Long> L, long x, double delta) {
        ArrayList<Long> newList = new ArrayList<>();
        for (long val : L) {
            newList.add(val);
            newList.add(val + x);
        }

        // Sort the list
        Collections.sort(newList);

        // Trim the list
        ArrayList<Long> trimmedList = new ArrayList<>();
        long prev = newList.get(0);
        trimmedList.add(prev);

        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i) > prev * (1 + delta)) {
                prev = newList.get(i);
                trimmedList.add(prev);
            }
        }
        return trimmedList;
    }

    public static long approxSubsetSum(long[] S, long T, double epsilon) {
        ArrayList<Long> L = new ArrayList<>();
        L.add(0L); // Initialize list with 0

        for (long x : S) {
            L = mergeAndTrim(L, x, epsilon / S.length);

            // Remove elements greater than T
            L.removeIf(val -> val > T);
        }

        // Return the largest value <= T
        return Collections.max(L);
    }

    public static void main(String[] args) {
        long[] S = {3, 34, 4, 12, 5, 2}; // Input set
        long T = 10; // Target sum
        double epsilon = 0.1; // Error parameter

        long result = approxSubsetSum(S, T, epsilon);
        System.out.println("Approximate Subset Sum: " + result);
    }
}


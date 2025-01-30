package data_structures;

public class Array_4_min_max {
    public static void min(int [] marks, int n){
        int min = marks[0];
        int i=0;
        while (i<n){
            if(marks[i]<min){
                min = marks[i];
            }
            i++;
        }
        System.out.println("Minimum element is "+min);
    }
    public static void max(int [] marks, int n){
        int max = marks[0];
        int i=0;
        while (i<n){
            if(marks[i]>max){
                max = marks[i];
            }
            i++;
        }
        System.out.println("Maximum element is "+max);
    }
    public static void main(String[] args) {
        int [] marks={20,5,90,47,56,47};
        int n = marks.length;
        min(marks,n);
        max(marks,n);
    }
}

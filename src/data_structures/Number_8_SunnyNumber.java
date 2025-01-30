package data_structures;

public class Number_8_SunnyNumber {
    public static boolean SqrootCheck(int n){
        double sqroot = Math.sqrt(n);
        return ((sqroot-Math.floor(sqroot))==0);
    }

    public static void main(String[] args) {
        int n = 40;
        for (int i = 0; i < n; i++) {
            if (SqrootCheck(i+1)){
                System.out.println("the Number "+i+" is Sunny Nmber");
            }
        }
    }
}

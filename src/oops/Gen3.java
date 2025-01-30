package oops;

public class Gen3 {
    public static void main(String[] args) {
        Data1<Integer,String> d1 = new Data1<>(101,"dj snake");
        System.out.println(d1);
        d1.display(d1.getKey(),45);
    }
}

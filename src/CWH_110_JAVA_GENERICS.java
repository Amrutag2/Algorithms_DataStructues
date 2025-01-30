import java.util.ArrayList;

class MyGenerics<T1,T2>{
    int val = 344;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class CWH_110_JAVA_GENERICS {
    public static void main(String[] args) {
        //generics aim to reduce bugs and enhance type safety
        ArrayList<Integer> arraylist = new ArrayList(); //<Integer>-java generic
       // ArrayList<int> arraylist = new ArrayList(); gives error cte
        arraylist.add(0);
        arraylist.add(8);
        arraylist.add(56);
        int a = arraylist.get(2);
        System.out.println(a);
        MyGenerics<Integer,String> g3=new MyGenerics(23,67,"Mystring");
        System.out.println(g3.getT1());
        System.out.println(g3.getT2());
    }
}

class A{
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of A");
    }

}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of B");
    }
    public void meth3(){
        System.out.println("I am method 3 of B");
    }
}
public class CWH_48_Method_overriding {
    public static void main(String[] args) {
        A first = new A();
        first.meth2();
        B first1 = new B();
        first1.meth2();
    }
}

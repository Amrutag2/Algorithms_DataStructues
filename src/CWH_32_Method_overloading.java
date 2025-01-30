public class CWH_32_Method_overloading {
    static void foo(){
        System.out.println("Good morning");
    }
    static void foo(String x){
        System.out.println("Hello, Good Morning "+x);
    }
    static void foo(String x, String y){
        System.out.println("Hello, Good Morning "+x+ " and "+y);
    }
    public static void main(String[] args) {
        String a = "Amruta";
        String b = "Atharva";
        foo();
        foo(a);
        foo(a,b);

    }
}

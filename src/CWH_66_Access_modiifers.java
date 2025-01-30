class C1{
    public int x =89;
    protected int y =9;
    private int a = 56;
     int b = 90;
     public void meth1(){
         System.out.println(x);
         System.out.println(y);
         System.out.println(a);
         System.out.println(b);
     }


}
public class CWH_66_Access_modiifers {
    public static void main(String[] args) {
        C1 C  = new C1();
        C.meth1();
        //System.out.println(C.a);// private cannot use in same package
    }
}

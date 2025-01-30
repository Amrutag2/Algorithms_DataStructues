class AnyClass{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    AnyClass(int v){
        this.a = v;
        System.out.println("done");
    }
    public int returnone(){
        return 1;
    }
}
class otherClass extends AnyClass{
    otherClass(int c){
        super(c);
        System.out.println("Mai ek constructor hu");
    }
        }
public class CWH_47_THIS_SUPER {
    public static void main(String [] args){
        AnyClass Ac = new AnyClass(5);
        System.out.println(Ac.getA());
        otherClass oC = new otherClass(7);
    }
}

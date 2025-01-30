class Base1{
    public int x;
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor with value of a = "+a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(67); // this is for overloaded base1 which takes the value of a
        System.out.println("I an derived class constructor");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("i am overloaded constructor of derived1 with value of a and b as :"+a+" "+b);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int y;

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a child of derived constructor");
    }
}
public class CWH_46_CINSTRUCTOR_with_INHERITANCE {
    public static void main(String[] args) {
    Base1 b = new Base1(); // due to this line base1 constructor invokes
    b.setX(56);
    System.out.println(b.x);
    Derived1 d1 = new Derived1();
    Derived1 d = new Derived1(14,9);
    // due to this line base1 constructor invokes as derived1 extends base1
    // 1st invoke base class constructor and the derived class
    d.setY(89);
    System.out.println(d.y);
    System.out.println(d.x);//0
    d.setX(9);
    System.out.println(d.x);//9
       ChildOfDerived Cd = new ChildOfDerived();
        ChildOfDerived Cd1 = new ChildOfDerived(2,4,5);
    }
}

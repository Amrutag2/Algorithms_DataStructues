

abstract class Parent2{
    Parent2(){
        System.out.println("I am Parent2 ka Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();//apne hisab se override karo
    abstract public void greet1();
}
class Child2 extends Parent2{ // this is how to override greet method
    public void greet(){
        System.out.println("good morning");
    }
    public void greet1(){
        System.out.println("good night");
    }
}
abstract class Child3 extends Parent2{
    public void the(){
        System.out.println("i am child3");
    }
}
public class CWH_53_Abstractclass_abstarctmethods {
    public static void main(String[] args) {
        Child2 CH = new Child2();
        //Parent2 p = new Parent2() ; WE CANNOT CREATE OBJECT OF ABSTRACT CLASS SAME FOR CHILD3
    }
}

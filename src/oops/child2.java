package oops;
//hierarchical Inheritance
//    A
// b1    b2
class Mom{
    void Mom(){
        System.out.println("Mom Constructor");

    }

    void mom(){
        System.out.println("Mom Method");

    }
}
class Child3 extends Mom{
    void child3(){
        System.out.println("Child3 Method");

    }
}
class Child2 extends Mom
{
    void Child2(){
        System.out.println("Child2 constructor");

    }

    void child2(){
        System.out.println("Child2 Method");

    }
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.Child2();
        c2.child2();
        c2.mom();
        c2.Mom();
        Child3 c3 = new Child3();
        //error c3.child2();
        c3.child3();
        c3.mom();
    }
}

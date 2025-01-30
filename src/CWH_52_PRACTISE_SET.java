class Circle{
    public int radius ;
    Circle(){ //no need of super in cylinder
        System.out.println("I am non param of circle");
    }
    Circle(int r){ //super in cylinder
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }

    public double Area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("i am cylinder 1 parameterized constructor");
        this.height=h;
    }

    public double Volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class CWH_52_PRACTISE_SET {
    public static void main(String[] args) {
        /*problem1 : create a class circle and use inheritance
        to create another class Cylinder from it.*/

        //Circle Cobj1 = new Circle(8);
       // Cylinder1  CyliObj = new Cylinder1(3,4)
    }
}

class Base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base and setting x ");
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class CWH_45_INHERITANCE {
    public static void main(String[] args){
        //creating an object of base class
        Base b = new Base();
        b.setX(8);
        System.out.println(b.getX());
        //creating an object of derived class
        Derived d = new Derived();
        d.setX(14);
        System.out.println(d.getX());
        d.setY(89);
        System.out.println(d.y);
        System.out.println(d.x);
    }
}

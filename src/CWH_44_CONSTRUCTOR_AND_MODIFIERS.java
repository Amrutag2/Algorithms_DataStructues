/*    chap 9
1. Create a class cylinder and
    use getter and setter to set its radius and height
2. use 1 to calculate surface area and volume of cylinder
3. use a constructor and repeat
4. overload a constructor used to initialize a rectangle of length 4
    and breadth 5 for using custom parameters
5. repeat 1 for a sphere
*/
class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*(height+radius);
    }
    public double Volume(){
        return Math.PI*radius*height*radius;
    }
    //USING CONSTRUCTOR PROB 3
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;

    }
}
class MyRectangle{

    private int lenght;
    private int breadth;
    public MyRectangle(){
        this.lenght=4;
        this.breadth=5;

    }
    public MyRectangle(int lenght,int breadth){
        this.lenght=lenght;
        this.breadth=breadth;

    }
    public int getLength(){
        return lenght;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class CWH_44_CONSTRUCTOR_AND_MODIFIERS {
    public static void main(String[] args){
        //problem 1
    Cylinder mycylinder = new Cylinder(9,12);
    //mycylinder.setHeight(12);
    System.out.println(mycylinder.getHeight());
    //mycylinder.setRadius(10);
    System.out.println(mycylinder.getRadius());
        //problem 2
    System.out.println(mycylinder.surfaceArea());
    System.out.println(mycylinder.Volume());
        //problem 4
    MyRectangle newRect = new MyRectangle();
        System.out.println(newRect.getLength());
        System.out.println(newRect.getBreadth());


    }
}

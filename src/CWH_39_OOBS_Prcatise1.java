class Tommy{
    public void hit(){
        System.out.println("Hitting enemy");
    }
    public void run(){
        System.out.println("Running away from enemy");
    }
    public void fire(){
        System.out.println("Firing enemy");
    }
}

class Rectangle{
    public int Area(int x, int y){
        return x*y;

    }
    public int Perimeter(int x, int y){
        return 2*(x+y);

    }
}
class Square{
    public int Area(int x){
        return x*x;

    }
    public int Perimeter(int x){
        return 4*(x);

    }
}
class Employee1{
    int id;
    int salary;
    String name;
    public int getsal(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }


}
class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void Call_a_friend(){
        System.out.println("Call Prachi...");
    }


}
public class CWH_39_OOBS_Prcatise1 {
    public static void main(String[] args) {
        //problem 1
        Employee1 happy = new Employee1();
        Employee1 Amruta = new Employee1();

        happy.id = 45;
        happy.name = "Happy";
        happy.salary = 9800;

        Amruta.id = 52;
        Amruta.name = "Amruta";
        Amruta.salary = 9100;

        System.out.println(happy.getsal());
        System.out.println(Amruta.getsal());

        happy.setName("Amu");
        System.out.println(happy.getName());


        //problem 2
        Cellphone vivov3 = new Cellphone();
        vivov3.ring();
        vivov3.vibrate();
        vivov3.Call_a_friend();

        //problem3
        Square S1 = new Square();
        Square S2 = new Square();
        System.out.println(S1.Area(4));
        System.out.println(S2.Perimeter(5));

        //Problem 4
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();
        System.out.println(R1.Area(4,5));
        System.out.println(R2.Perimeter(5,6));

        Tommy player1 = new Tommy();
        Tommy player2 = new Tommy();
        player1.hit();
        player2.run();
    }
}

interface Bicycle{
    int a=80;
    void applyBrake(int decrement); //methods of interface should be public in avoncycle
    void speedUp(int increment);
}
interface Bicycle2{
    void accelerate(int decrement); //methods of interface should be public in avoncycle
    void velocity(int increment);
}
class AvonCycle implements Bicycle, Bicycle2{
    void BlowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
    public void accelerate(int decrement){
        System.out.println("break mar");
    }
    public void velocity(int increment){
        System.out.println("speed kar");
    }
}
public class CWH_54_INTERFACES {
    public static void main(String[] args) {
        AvonCycle AC = new AvonCycle();
        AC.BlowHorn();
        AC.accelerate(5);
        //you can create properties in interfaces i.e. int a;
        System.out.println(AC.a);
        //you cannot modify the properties in interfaces as they are final
        //AC.a = 78; gives error
        

    }
}

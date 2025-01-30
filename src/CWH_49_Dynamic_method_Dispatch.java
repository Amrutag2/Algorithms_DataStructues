class Phone{
    public void on(){
        System.out.println("Turn on Phone");
    }
    public void Greet(){
        System.out.println("Good Morning");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turn on SmartPhone");
    }
    public void Music(){
        System.out.println("Play Music");
    }
}
public class CWH_49_Dynamic_method_Dispatch {
    public static void main(String[] args) {
//    Phone obj = new Phone();
//    SmartPhone obj1 = new SmartPhone();
//    obj.name();


//this is call dynamic method dispatch(run time polymorphism -  creation of obj at runtime when program is running)
        Phone obj2 = new SmartPhone();// superclass ka ref can be equal to obj of subclass
        //SmartPhone obj1 = new Phone(); gives error not allowed
        obj2.Greet();
        obj2.on();//this is call dynamic method dispatch
        //obj2.Music(); not allowed
    }
}

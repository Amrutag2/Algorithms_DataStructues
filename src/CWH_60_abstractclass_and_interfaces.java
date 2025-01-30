
//prb1 create an abstract class pen with methods write() and refill() as abstract methods
abstract class Pen{
    abstract void Write();
    abstract void Refill();

}

// PRB2 use the pen classs from prb1 to create a concrete class fountainpen with additional method changeNib()
/*abstract*/ class FountainPen  extends Pen{ //override method write and refill or change abstract class fountainpen
    void Write(){
        System.out.println("write");
    }
    void Refill(){
        System.out.println("Refill");
    }
    void  changeNib(){
        System.out.println("chnagenib");
    }

}

//PRB3 CREATE A CLASS MONKEY WITH JUMP() AND BITE() METHODS.
// CREATE A CLASS HUMAN WHICH INHERITS THIS MONKEY CLASS AND
// IMPLEMENTS BasicAnimal INTEFACE with eat() and sleep() methods.

class Monkey{
    void Jump(){
        System.out.println("jump");
    };

    void Bite(){
        System.out.println("jump");
    };


}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void  speak(){
        System.out.println("hello sir");
    }
    @Override
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }

}



public class CWH_60_abstractclass_and_interfaces {
    public static void main(String[] args) {
        Pen Fp = new FountainPen();
        Fp.Refill();
        Fp.Write();
        //Fp.changeNib(); NOT ALLOWED

        Monkey MK = new Human();// polymorpism
        MK.Bite();
        MK.Jump();//canot use speak

        Human hm = new Human();
        hm.eat();
        hm.Jump();
        hm.Bite();
        hm.sleep();
        hm.speak();

        BasicAnimal BA = new Human();
        BA.eat();
        BA.sleep();
    }
}


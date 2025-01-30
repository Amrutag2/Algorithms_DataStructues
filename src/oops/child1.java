package oops;

//multiLevel INheritance
class GrandParent{
    void grand(){
        System.out.println("Grand Parent Method");
    }
}

class parent1 extends GrandParent{
    void pare(){
        System.out.println("Parent Method");
    }
}

 class child1 extends parent1{
    void child(){
        System.out.println("child Method");

    }
     public static void main(String[] args) {
         child1 ch1 = new child1();
         ch1.child();
         ch1.pare();
         ch1.grand();

         parent1 pt = new parent1();
         pt.grand();
         pt.pare();

         GrandParent gp = new GrandParent();
         gp.grand();
     }
}

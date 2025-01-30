package oops;

//Single Inheritance
class parent{
    void teach(){
        System.out.println("In parent method");
    }

}

class child extends parent {
    void learn(){
        System.out.print("Child mesthod");
    }
    public static void main(String []args){
        child cd = new child();
        cd.teach();
        cd.learn();
    }
}

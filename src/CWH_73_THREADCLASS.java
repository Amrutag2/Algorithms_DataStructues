class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i = 9;
        System.out.println("hiii");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }

}

public class CWH_73_THREADCLASS {
    public static void main(String[] args) {
        Mythr mt = new Mythr("amu");
        mt.start();
        Mythr mt1 = new Mythr("qthi");
        mt1.start();
        System.out.println("The id of the thread t is "+mt.getId());
        System.out.println("The name of the thread t is "+mt.getName());
        System.out.println("The id of the thread t is "+mt1.getId());
        System.out.println("The name of the thread t is "+mt1.getName());
    }
}

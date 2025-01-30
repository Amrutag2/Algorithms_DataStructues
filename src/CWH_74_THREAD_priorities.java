
class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 9;

        while (true){
            System.out.println("hiii" + this.getName());
        }
    }

}
public class CWH_74_THREAD_priorities {
    public static void main(String[] args) {
        //ready queue :t1,t2,t3,t4  jvm responsible
        // to run all the thread in ready queue
        Mythr1 mt = new Mythr1("amu");
        Mythr1 mt1 = new Mythr1("amu1");
        Mythr1 mt2 = new Mythr1("amu2");
        Mythr1 mt3 = new Mythr1("amu3");
        Mythr1 mt4 = new Mythr1("amu4 (mostimp)");
        mt4.setPriority(Thread.MAX_PRIORITY);
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt.start();

    }
}

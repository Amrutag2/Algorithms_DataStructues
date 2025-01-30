class Prb1A extends Thread{
    public void run(){

            System.out.println("Good morning");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }

    }

}

class Prb1B extends Thread{
    public void run(){

            System.out.println("Good NIGHT");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }

    }

}
public class CWH_76_THREAD_PRACTISE {
    public static void main(String[] args) {
        Prb1A P1 = new Prb1A();
        P1.start();
        Prb1B P2 = new Prb1B();
        System.out.println(P2.getState());//new
        P2.start();
//        P1.setPriority(9);
//        P2.setPriority(2);
        System.out.println(P1.getPriority());
        System.out.println(P2.getPriority());
        System.out.println(P2.getState());//runnable
    }
}


class Mythrnew1 extends Thread{
    public void run(){

        while (true){

            System.out.println("hiii1" );
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Mythrnew2 extends Thread{
    public void run(){
        while (true){
            System.out.println("hiii2" );
        }
    }
}
public class CWH_75_Thread_methods {
    public static void main(String [] args){
        Mythrnew1 T1 = new Mythrnew1();
        T1.start();
        try{
            T1.join();  //1st t1 and t2 will not start until t1 is finished
        }
        catch (Exception e){
            System.out.println(e);
        }
        Mythrnew2 T2 = new Mythrnew2();
        T2.start();

    }

}

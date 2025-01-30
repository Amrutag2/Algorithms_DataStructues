class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<200){
            System.out.println("My thread is cooking");
            System.out.println("I am happy ");
            i++;
        }

    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<200){
            System.out.println("My thread 2 is chatting");
            System.out.println("I am sad");
            i++;
        }

    }
}



public class CWH_70_MULTITHREADING {
    public static void main(String[] args) {
        myThread1 T1 = new myThread1();
        myThread2 T2 = new myThread2();
        T1.start();
        T2.start();
    }
}

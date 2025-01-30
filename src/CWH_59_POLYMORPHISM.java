
interface Camera3{
    void takeSnap();
    void recordVideo();

    default void record4KVideo(){

        System.out.println("Recording in 4K...");
    }
}
interface WiFi3{
    String[] getNeworks();
    void ConnectNetwork(String Network);
}
class CellPhone233{
    CellPhone233(){ //constructor
        System.out.println("i am cellphone 23");
    }
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void callAccept(){
        System.out.println("connecting...");
    }


}
class MySmartPhone3 extends CellPhone233 implements Camera3,WiFi3 {
    public void takeSnap(){
        System.out.println("take a snap");
    }
    public void recordVideo(){
        System.out.println("take a snap");
    }
    public String[] getNeworks(){
        System.out.println("Getting list of networks");
        String [] networkLists={"Amruta","AtharvA","Vidyalankar"};
        return networkLists;
    }
    public void ConnectNetwork(String Network){
        System.out.println("Connecting to "+Network);
    }
    public void record4KVideo(){
        System.out.println("take snap and Recording in 4K...");
    }

}


public class CWH_59_POLYMORPHISM {
    public static void main(String[] args) {
        Camera3 cm3 = new MySmartPhone3();//polymorphism
        //this is a smartphone use it as a camera
        //cm3.getNetworks(); not allowed
        cm3.record4KVideo();

        MySmartPhone3 cm56 = new MySmartPhone3();
        cm56.getNeworks();
        cm56.callNumber(56);
        cm56.recordVideo();
    }
}

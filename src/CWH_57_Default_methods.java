interface Camera{
    void takeSnap();
    void recordVideo();

    default void record4KVideo(){

        System.out.println("Recording in 4K...");
    }
}
interface WiFi{
    String[] getNeworks();
    void ConnectNetwork(String Network);
}
class CellPhone23{
    CellPhone23(){ //constructor
        System.out.println("i am cellphone 23");
    }
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void callAccept(){
        System.out.println("connecting...");
    }


}
class MySmartPhone extends CellPhone23 implements Camera,WiFi{
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

public class CWH_57_Default_methods {
    public static void main(String[] args) {
        MySmartPhone SP = new MySmartPhone();
        String[] ar = SP.getNeworks();
        for (String item:ar){
            System.out.println(item);
        }
        SP.record4KVideo(); // if we override record4kvideo in
        // mysmartphone then it will ignore default from camera interface
        // and print from smartphone
    }
}

public class CWH_80_TRYCATCH {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;//if b = 0 ; arithmetic exception

        try {
             int c =a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("we failed to divide. Reason :");
            System.out.println(e);
        }
        System.out.println("end of the program");

    }
}

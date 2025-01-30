public class CWH_85_FINALLY_TRYCATCH_BLOCK {
    public static int greet(){
        try{
            int a  =50;
            int b = 0;
            int c =a/b;
            return c;
        }catch (Exception e ){
            System.out.println(e);

        }
        finally {
            System.out.println("This is the end of the prog");

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(greet());//if -1 then error
        int a=7;int b=9;
        while (true){
            try {

                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("value of b "+b);
                // will run even though break statement
            }
            b--;
        }
        try {
            System.out.println(50/10);
        }finally {
            System.out.println("50/10 ended");
        }
    }
}

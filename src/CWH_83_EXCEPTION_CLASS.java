import java.util.Scanner;

class exception extends Exception {
    @Override
    public String toString() {
        return " i am toString";
    }

    @Override
    public String getMessage() {
        return " i am getmessage";
    }
}
public class CWH_83_EXCEPTION_CLASS {
    public static void main(String[] args) throws exception {
    int a = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    if (a<99){
        try{
            //throw new exception();
            throw new ArithmeticException(" this is an exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);//default toString()
            e.printStackTrace();
            System.out.println("yo finished");
        }
        System.out.println("finished");
    }
    }
}

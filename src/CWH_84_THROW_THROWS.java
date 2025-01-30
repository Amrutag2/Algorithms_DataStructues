import java.util.Scanner;
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return " Raidus cannot be negative";
    }

    @Override
    public String getMessage() {
        return " i am getmessage";
    }
}

public class CWH_84_THROW_THROWS {
    public static double Area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;

    }
    public static int divide(int a, int b) throws ArithmeticException{

            int result = a/b;
            System.out.println(result);
            return result;

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number ");
        int c= sc.nextInt();
        int d= sc.nextInt();
        try{
            int r = divide(c,d);
            double ar = Area(c);
            System.out.println(r);
        }catch (Exception e){
            System.out.println("Exception");
        }


    }
}

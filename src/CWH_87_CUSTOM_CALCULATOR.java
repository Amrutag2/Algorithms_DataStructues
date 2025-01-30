
class InvalidInputException extends Exception{
    public String toString(){
        return "cannot add 8 9";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "invalid input more than 100000";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "Cannot multiply no greater than 7000";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}

class CannotDivideByZero extends Exception{
    public String toString(){
        return "cannot divide by zero-invlid operation";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}
class Custom_cal {
    double add(double a, double b) throws InvalidInputException,MaxInputException
    {
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        if(a==8 && b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a, double b)throws MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double div(double a, double b)throws CannotDivideByZero,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }
    double mul(double a, double b)throws MaxMultiplyInputException{
        if(a>7000||b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }

}

public class CWH_87_CUSTOM_CALCULATOR {
    /*
    Exercise 6: you have to create a custom calculator with the following operations:
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplication
    4. / -> Division
    which throws  the following exception
    1. Invalid input Exception ex:8 & 9
    2. Cannot divide by 0 exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max multiplier reached Exception - don't allow anu multiplication input greater than 7000
    */

    public static void main(String[]args) throws InvalidInputException, CannotDivideByZero,MaxInputException,MaxMultiplyInputException {
        Custom_cal cal = new Custom_cal();
        System.out.println(cal.add(7,5));
        System.out.println(cal.div(7,2));
        System.out.println(cal.mul(7,9000));

    }
}

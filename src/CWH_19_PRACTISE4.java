import java.util.Scanner;

public class CWH_19_PRACTISE4 {
    public static void main(String[] args) {
        //problem 1
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }

        //problem 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of maths out of 100");
        float maths = input.nextFloat();
        System.out.println("Enter marks of maths out of 100");
        float science = input.nextFloat();
        System.out.println("Enter marks of maths out of 100");
        float english = input.nextFloat();
        float total = (science+maths+english)/3.0f;
        System.out.println(total);
        if (total>40 && maths>33 && science>33 && english>33){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }

        //problem 3
        System.out.println("Enter your income in lkhs per annum :");
        float tax=0;
        float income= input.nextFloat();;

        if(income<2.5){
            tax=tax+0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
            
        } else if (income>5f && income<=10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);

        }else if (income>10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);


        }
        System.out.println("Total tex paid by the employee"+tax );

        //problem 4
        System.out.println("Enter day number");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid input");
        }
        //problem 6 find out the type of website

    }
}

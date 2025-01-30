import java.util.Random;
import java.util.Scanner;

// WITHOUT OOPS
/*
    Create a class Game which allows a user to play "Guess the Number"
    game once, game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getters and setter for no of guesses
    use properties such as noOfguess(int) , etc to get this task done
*/
public class CWH_43_EX3 {
    public static void main(String[] args){
        int r,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 100");
        i = sc.nextInt();
        Random rd = new Random();

        r = rd.nextInt(100);
        if (r<i)
        {
            System.out.println("the number you have guess is greater");
        }
        else if (r>i) {
            System.out.println("the number you have guess is smaller");
        }
        else{
            System.out.println("you guessed correct number");
        }
        System.out.println("The number = "+r +" and your guess = "+i);
    }
}

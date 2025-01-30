//USING OOPS EX3 VIDEO 43
/*
    Create a class Game which allows a user to play "Guess the Number"
    game once, game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getters and setter for no of guesses
    use properties such as noOfguess(int) , etc to get this task done
*/
import java.util.Random;
import java.util.Scanner;

class Game{
    public int Inputnumber;
    public int number;
    public int noofGuesses;

    public int getNoofGuesses() {
        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;

    }


    Game( ){
        Random rd = new Random();
        this.number= rd.nextInt(100);

    }
    int takeUserInput(){
        System.out.println("your guess");
        Scanner sc = new Scanner(System.in);
        Inputnumber = sc.nextInt();
        return Inputnumber;
    }
    boolean isCorrectNumber(){
        noofGuesses++;
        if(Inputnumber == number){
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts", number,noofGuesses);
            return true;

        } else if (Inputnumber<number) {
            System.out.println("too low");
        } else if (Inputnumber>number) {
            System.out.println("too high");
        }
            return false;

    }
}
public class CWH_50_GUESS_GAME {
    public static void main(String[] args) {
    Game g = new Game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }

    }
}

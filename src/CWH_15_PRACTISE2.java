import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_15_PRACTISE2 {
    public static void main(String[] args) {
        //problem 1 to convert a string to lower string
        String name = "Jack Praker";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2 replace space to underscore
        String removeSpace = name.replace(" ","_");
        System.out.println(removeSpace);

        //problem 3 to fill the letter template
        String letter = "Dear <|name|>, Thanks alot";
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);

        //priblem 4 to detect double and triple spaces
        String Mystring = "This string contains    double and triple spaces";
        System.out.println(Mystring.indexOf("  "));
        System.out.println(Mystring.indexOf("   "));

        //problem 5 letter format escape sequence
        String myString = "Dear Harry,\n\tThis Java Course is Nice.\n\tThanks!";
        System.out.println(myString);



    }
}

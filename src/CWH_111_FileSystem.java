import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_FileSystem {
    public static void main(String[] args) throws IOException {
        //code to create a new file
        /*
        File myFile = new File("Amu.txt");
        try {
            myFile.createNewFile();
        }catch (IOException e)
        {
            System.out.println("Unable to create new file");
            e.printStackTrace();
        }
        */

        //code to write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("Amu.txt");
            fileWriter.write("hello i am amruta gulekar computer engineering graduate");
            fileWriter.close();

        }
        catch (Exception e){
            System.out.println(e);
        }

         */
        //Reading a file
        /*
        File myFile = new File("Amu.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        */
        //deleting file
        File myFile = new File("Amu.txt");
        if(myFile.delete()){
            System.out.println("i have deleted "+myFile.getName());
        }
        else {
            System.out.println("Some error while deleting the file");
        }

    }
}

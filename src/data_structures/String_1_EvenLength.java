package data_structures;

public class String_1_EvenLength {
    public static void main(String[] args) {
        String Str = "his is ala school Teacher.";
        String [] Arr = Str.split("[.\\s]");
        for (String s : Arr){
            if(s.length()%2 == 0 ){
                System.out.println(s);
            }

        }
    }
}

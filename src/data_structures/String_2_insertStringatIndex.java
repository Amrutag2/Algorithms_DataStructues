package data_structures;
//Strings are immutable

public class String_2_insertStringatIndex {
    public static void main(String[] args) {
        String str = "Hello ,Beautiful ";
        String name = str.substring(5,str.length());
        System.out.println(name);
        //next(),nextLine() scanner
        System.out.println(str.concat("Amruta")); //concatenation
         //charAt
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        String Abc = "Amruta";
        String Abc1 = "amruta";
        //1 s1>s2 : +ve value
        //2 s1=s2 : 0
        //3 s1<s2 : -ve value //hello < wello
        if(Abc.compareTo(Abc1) == 0){
            System.out.println("Equal strings");
        }
        else System.out.println("not equal");

        //Problem to insert String at Index

        StringBuilder sb  = new StringBuilder("Amu Gulekar");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        //set charcter at index
        sb.setCharAt(2,'p');
        //solution
        sb.insert(4,"Samir ");
        System.out.println(sb);
    }
}

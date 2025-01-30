package oops;



import java.util.LinkedList;
import java.util.List;

class Name{
    private String name;
    public Name(String name){
        this.name= name;

    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
}
public class ListObj {
    public static void main(String[] args) {
        List<Object> l = new LinkedList<>() ;
        l.add(new Name1("Amu"));
        l.add("34");
        l.add(new Name1("Athu"));
        l.add(3.55f);
        l.add('$');
        l.add("Hello");
        System.out.println(l);
        for(Object temp:l){
            System.out.println(temp);
        }

    }
}

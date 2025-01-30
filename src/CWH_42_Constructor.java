
class myMainEmoployee{
    private int id;
    private String name;
    public myMainEmoployee() //automatically invoke beacuse it is a constructor
   {
        id = 45;
        name = "default";
    }
    //constructor overloading
    public myMainEmoployee(int ID,String myName) //automatically invoke beacuse it is a constructor
    {
        id = ID;
        name = myName;
    }
    public myMainEmoployee(String myName) //automatically invoke beacuse it is a constructor
    {
        id = 9;
        name = myName;
    }
    public void setName(String n) { this.name = n; }
    public String getName(){ return name ;}
    public int getId(){ return id;}
    public void setId(int n){ this.id=n;}

}

public class CWH_42_Constructor {
    public static void main(String[] args){
        myMainEmoployee Harry = new myMainEmoployee(34,"AMRUTA");
        myMainEmoployee Harry1 = new myMainEmoployee();
        myMainEmoployee Harry2 = new myMainEmoployee("Atharva");

        //Harry.setId(45);
        //Harry.setName("Harry");
        System.out.println(Harry.getName());
        System.out.println(Harry.getId());
        System.out.println(Harry1.getName());
        System.out.println(Harry1.getId());
        System.out.println(Harry2.getName());
        System.out.println(Harry2.getId());
    }
}

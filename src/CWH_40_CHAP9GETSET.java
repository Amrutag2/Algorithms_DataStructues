
class myEmoployee{
    private int id;
    private String name;
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name ;
    }
    public int getId(){
        return id;
    }
    public void setId(int n){
        this.id=n;
    }

}

public class CWH_40_CHAP9GETSET {
    public static void main(String[] args){
        myEmoployee Harry = new myEmoployee();
        Harry.setId(45);
        Harry.setName("Harry");
        System.out.println(Harry.getName());
        System.out.println(Harry.getId());
    }
}

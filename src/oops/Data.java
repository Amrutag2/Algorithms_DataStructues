package oops;

public class Data <T>{
    private T object;
    public Data(T object){
        this.object = object;
    }
    public String toString(){
        return object.toString();
    }
}

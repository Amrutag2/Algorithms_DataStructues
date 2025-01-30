package oops;

public class Generics <T>{
    private T data;
    public Generics(T d){
        this.data=d;
    }
    public T getData(){
        return data;
    }
}

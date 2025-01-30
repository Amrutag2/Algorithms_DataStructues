package oops;

public class Data1 <K,V>{
    private K key;
    private V value;
    public Data1(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public String toString(){
        return "Data { key = '"+key+"', value = '"+value+"' }";
    }
    public<E,N extends Number> void display(E element,N number){
        System.out.println("Element ='"+element+"', number='"+number+"'");
    }
}

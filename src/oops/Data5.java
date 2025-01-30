package oops;
import oops.Name1;
public class Data5 <K extends Number,V extends Name1>{
    private K key;
    private V value;

    @Override
    public String toString() {
        return "Data5{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Data5(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

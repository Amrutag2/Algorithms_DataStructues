package oops;
import oops.Data;
import java.util.ArrayList;
import java.util.List;

public class Gen2 {
    public static void main(String[] args) {
        List<Data<Object>> list1 = new ArrayList<>();
        list1.add(new Data<>("Amruta"));
        list1.add(new Data<>("VJTI"));
        list1.add(new Data<>("Mtech"));
        list1.add(new Data<>(26));
        for (Object d: list1) {
            System.out.println(d.toString());

        }
    }
}

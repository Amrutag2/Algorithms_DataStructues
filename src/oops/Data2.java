package oops;

import java.util.List;

public class Data2 {
    public <E> void printlistData(List<E> L1){
        for(E data: L1){
            System.out.println(data);
        }
    }
}

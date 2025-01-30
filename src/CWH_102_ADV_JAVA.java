import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;


public class CWH_102_ADV_JAVA {
    public static void Print(ArrayList<String> arr){
    for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }

    public static void main(String[] args) {
        //problem 1
        ArrayList<String> arr = new ArrayList();
        arr.add(0,"Student 1");
        arr.add(1,"Student 2");
        arr.add(2,"Student 3");
        arr.add(3,"Student 4");
        arr.add(4,"Student 5");
        arr.add(5,"Student 6");
        Print(arr);
//        for(Object o:arr){
//            System.out.println(o);
//        }

        // create a set in java try to store duplicates elements inside this set
        // and verify that only one instance is stored
        HashSet<Integer> hs = new HashSet();
        hs.add(5);
        hs.add(50);
        hs.add(53);
        hs.add(25);
        hs.add(58);
        hs.add(53);
        System.out.println(hs);

        Date d = new Date();
        System.out.println(d.getHours() +":" + d.getMinutes()+":" + d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":" + c.get(Calendar.MINUTE)+":" + c.get(Calendar.SECOND));

    }
}

import java.sql.Time;
import java.util.Date;

public class CWH_96_DATE_TIME {
    public static void main(String[] args) {
        Date dt = new Date();//type long
        Time time = new Time(7);
        System.out.println(time);
        System.out.println(dt);
        System.out.println(dt.getTime());
        System.out.println(dt.getYear());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/365/1000/3600/24);
    }
}

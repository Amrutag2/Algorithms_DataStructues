import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_98_CALENDER {
    public static void main(String[] args) {
//        Calendar cl = Calendar.getInstance();
//        System.out.println(cl.getCalendarType());
//        System.out.println(cl.getTimeZone());

        Calendar cl = Calendar.getInstance();
        System.out.println(cl.getCalendarType());
        System.out.println(cl.getTimeZone().getID());
    }
}

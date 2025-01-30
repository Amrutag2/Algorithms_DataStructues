import java.util.Calendar;
import java.util.GregorianCalendar;
//GMT - GREENWICH MEAN TIME ZONE

public class CWH_99_GREGORIAN_CALENDER {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println(cl.getTimeZone().getID());
        System.out.println(cl.getTime());
        System.out.println(cl.getCalendarType());
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.MONTH));
        System.out.println(cl.get(Calendar.YEAR));
        System.out.println(cl.get(Calendar.SECOND));
        System.out.println(cl.get(Calendar.HOUR));
        System.out.println(cl.get(Calendar.HOUR_OF_DAY) +" : "+cl.get(Calendar.MINUTE));
        System.out.println(cl.get(Calendar.DAY_OF_MONTH));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        System.out.println(gc.isLeapYear(2004));
    }
}

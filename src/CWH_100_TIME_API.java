import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_100_TIME_API {
    public static void main(String[] args) {
        LocalDate l = LocalDate.now();
        System.out.println(l);
        System.out.println(l.getDayOfMonth());
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}

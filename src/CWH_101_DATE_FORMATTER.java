import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CWH_101_DATE_FORMATTER {
    //DATETIMEFORMATTER
    public static void main(String[] args) {
        LocalDateTime df = LocalDateTime.now();
        System.out.println(df);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dtf2);
        System.out.println(dtf);
        String myDate = df.format(dtf);
        System.out.println(myDate);
        String myDate1 = df.format(dtf2);
        System.out.println(myDate1);
    }
}

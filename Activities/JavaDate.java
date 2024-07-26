import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class JavaDate {


    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalTime time1 = LocalTime.now();
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2021, 2, 28, 12, 0, 20);

        System.out.println(date1);
        System.out.println(time1);
        System.out.println(dt1);

    }
}
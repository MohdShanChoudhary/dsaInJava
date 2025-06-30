import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class LocalDateAndTime1 {
    public static void main(String[] args)
    {
        System.out.println("local date api ");
        LocalDate today = LocalDate.now();
        System.out.println("todays date is "+today);
        int year=today.getDayOfYear();
        int day=today.getDayOfMonth();
        int month=today.getMonthValue();
        System.out.println(year+"\n"+day+"\n"+month);

        System.out.println("Loacl time api ");
        LocalTime timenow=LocalTime.now();
        System.out.println("now time is "+ timenow);
        LocalTime c=LocalTime.of(23, 32);
        LocalTime minuss=timenow.minusHours(2);
        System.out.println("bifore 2 hours"+minuss);

        System.out.println("local date  and time ");
        LocalDateTime noww=LocalDateTime.now();
        System.out.println(noww);


    }
}

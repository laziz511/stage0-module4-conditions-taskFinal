package school.mjc.stage0.conditions.finalTask;
import java.time.YearMonth;
public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year < 1 || month > 12 || month < 1)
        {
            System.out.println("invalid date");
            return;
        }
        System.out.println(YearMonth.of(year, month).lengthOfMonth());

    }
}

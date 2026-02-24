import java.util.Calendar;

public class DayFinder {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1); // Month is 0-based
        cal.set(Calendar.DAY_OF_MONTH, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String[] days = {
                "SUNDAY", "MONDAY", "TUESDAY",
                "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[dayOfWeek - 1];
    }
}

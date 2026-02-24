import java.util.*;

public class TimeConversion {

    public static String timeConversion(String s) {

        String period = s.substring(8);     // AM or PM
        String timePart = s.substring(0, 8); // HH:MM:SS
        int hour = Integer.parseInt(s.substring(0, 2));

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else { // PM
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d%s", hour, timePart.substring(2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(timeConversion(s));

        sc.close();
    }
}

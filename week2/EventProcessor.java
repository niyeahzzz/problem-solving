import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    String name;
    LocalDate date;

    public Event(String name, String dateStr) {
        this.name = name;
        this.date = LocalDate.parse(dateStr); // yyyy-MM-dd format
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class EventProcessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

        // 1️⃣ Sort events chronologically
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        sortedEvents.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        // 2️⃣ Earliest event
        Event earliest = sortedEvents.get(0);
        System.out.println(earliest.getName());

        // 3️⃣ Latest event
        Event latest = sortedEvents.get(sortedEvents.size() - 1);
        System.out.println(latest.getName());

        // 4️⃣ Filter events by given month
        sortedEvents.stream()
                .filter(e -> e.getDate().getMonthValue() == month)
                .forEach(e -> System.out.print(e.getName() + " "));
    }
}

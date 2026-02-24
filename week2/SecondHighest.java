import java.util.*;
import java.util.stream.*;

public class SecondHighest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(sc.nextInt());
        }

        Integer secondHighest = numbers.stream()
                .distinct()                     // remove duplicates
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                        // skip highest
                .findFirst()                    // get second highest
                .orElse(-1);                    // if not present return -1

        System.out.println(secondHighest);
    }
}

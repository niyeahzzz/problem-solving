import java.util.*;

public class GenerateSeriesNthElement {

    public static int findNthElement(int a, int b, int c, int n) {

        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;

        int diff1 = b - a;
        int diff2 = c - b;

        int current = c;

        for (int i = 4; i <= n; i++) {
            if ((i - 4) % 2 == 0) {
                current += diff1;
            } else {
                current += diff2;
            }
        }

        return current;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(findNthElement(a, b, c, n));

        sc.close();
    }
}

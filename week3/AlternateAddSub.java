import java.util.*;

public class AlternateAddSub {

    public static int AddSub(int N, int opt) {

        int result = 0;
        int sign;

        if (opt == 1) {
            sign = 1;  // Start with positive (N)
        } else {
            sign = 1;  // Start with positive (N)
        }

        for (int i = N; i >= 1; i--) {

            if (opt == 1) {
                // Pattern: + - + - + -
                result += sign * i;
                sign *= -1;
            } 
            else {
                // Pattern: + + - + - +
                if (i == N || i % 2 == N % 2) {
                    result += i;
                } else {
                    result -= i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int opt = sc.nextInt();

        System.out.println(AddSub(N, opt));

        sc.close();
    }
}

interface DigitSum {
    int calculate(int num);
}

public class DigitSumLambda {
    public static void main(String[] args) {

        DigitSum evenSum = (num) -> {
            int sum = 0;
            while (num > 0) {
                int d = num % 10;
                if (d % 2 == 0) sum += d;
                num /= 10;
            }
            return sum;
        };

        DigitSum oddSum = (num) -> {
            int sum = 0;
            while (num > 0) {
                int d = num % 10;
                if (d % 2 != 0) sum += d;
                num /= 10;
            }
            return sum;
        };

        System.out.println("Even digit sum: " + evenSum.calculate(12345));
        System.out.println("Odd digit sum: " + oddSum.calculate(12345));
    }
}

import java.util.Scanner;

public class SumOfSumsOfDigits {

    public static int sumOfSumsOfDigits(int input1) {

        String number = String.valueOf(input1);
        int n = number.length();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int digit = number.charAt(i) - '0';
            total += digit * (n - i);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();

        System.out.println(sumOfSumsOfDigits(input1));

        sc.close();
    }
}

import java.util.Scanner;

public class AllDigitsCount {

    public static int countDigits(int number) {
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(countDigits(number));

        sc.close();
    }
}

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    // Lambda for Odd check
    public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    // Lambda for Prime check
    public PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Lambda for Palindrome check
    public PerformOperation isPalindrome() {
        return (int a) -> {
            int original = a;
            int reverse = 0;

            while (a > 0) {
                int digit = a % 10;
                reverse = reverse * 10 + digit;
                a = a / 10;
            }

            return original == reverse;
        };
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath myMath = new MyMath();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();
            PerformOperation op;

            switch (ch) {
                case 1:
                    op = myMath.isOdd();
                    System.out.println(op.check(num) ? "ODD" : "EVEN");
                    break;
                case 2:
                    op = myMath.isPrime();
                    System.out.println(op.check(num) ? "PRIME" : "COMPOSITE");
                    break;
                case 3:
                    op = myMath.isPalindrome();
                    System.out.println(op.check(num) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
        sc.close();
    }
}

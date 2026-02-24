import java.util.function.IntPredicate;

public class PalindromeNumber {
    public static void main(String[] args) {

        IntPredicate isPalindrome = num -> {
            int original = num, reverse = 0;

            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            return original == reverse;
        };

        System.out.println(isPalindrome.test(121)); // true
        System.out.println(isPalindrome.test(123)); // false
    }
}

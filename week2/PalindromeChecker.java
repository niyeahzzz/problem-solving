import java.util.Scanner;

public class PalindromeChecker {

    public static int isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 1;  // Not a palindrome
            }
            left++;
            right--;
        }

        return 2;  // Palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(isPalindrome(input));

        sc.close();
    }
}

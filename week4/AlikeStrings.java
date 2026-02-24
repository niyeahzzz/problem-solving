public class AlikeStrings {

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                countA++;
            }
        }

        for (int i = mid; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                countB++;
            }
        }

        return countA == countB;
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    // Main method to test
    public static void main(String[] args) {
        String s1 = "book";
        String s2 = "textbook";

        System.out.println(halvesAreAlike(s1)); // true
        System.out.println(halvesAreAlike(s2)); // false
    }
}

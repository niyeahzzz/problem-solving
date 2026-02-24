import java.util.*;

public class Lapindromes {

    public static boolean isLapindrome(String s) {

        int len = s.length();
        int mid = len / 2;

        String left, right;

        if (len % 2 == 0) {
            left = s.substring(0, mid);
            right = s.substring(mid);
        } else {
            left = s.substring(0, mid);
            right = s.substring(mid + 1);
        }

        int[] freq = new int[26];

        for (char c : left.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : right.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // consume newline

        while (T-- > 0) {
            String s = sc.nextLine();
            if (isLapindrome(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}

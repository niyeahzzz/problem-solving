import java.util.*;

public class CompareTriplets {

    public static int[] compareTriplets(int[] a, int[] b) {

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
            } else if (a[i] < b[i]) {
                bobScore++;
            }
        }

        return new int[]{aliceScore, bobScore};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = compareTriplets(a, b);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}

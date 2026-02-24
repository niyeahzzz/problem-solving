import java.util.*;

public class MiniMaxSum {

    public static void miniMaxSum(int[] arr) {
        long total = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int num : arr) {
            total += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        miniMaxSum(arr);
        sc.close();
    }
}

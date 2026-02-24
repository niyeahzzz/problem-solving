import java.util.Scanner;

public class HillPatternWeight {

    public static long findTotalWeight(int input1, int input2, int input3) {
        long totalWeight = 0;

        for (int i = 1; i <= input1; i++) {
            int weightPerStar = input2 + (i - 1) * input3;
            totalWeight += (long) i * weightPerStar;
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt(); // total levels
        int input2 = sc.nextInt(); // head level weight
        int input3 = sc.nextInt(); // increment per level

        System.out.println(findTotalWeight(input1, input2, input3));

        sc.close();
    }
}

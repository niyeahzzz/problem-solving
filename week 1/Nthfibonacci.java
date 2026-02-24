public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int a = 0, b = 1;

        if (n == 1) {
            System.out.println(a);
            return;
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Nth Fibonacci: " + b);
    }
}

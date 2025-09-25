import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to compute its Fibonacci: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long fibNumber = computeFibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is " + fibNumber);
        }

        scanner.close();
    }

    public static long computeFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}

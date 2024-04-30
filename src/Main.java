import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("List of fibonacci numbers:");
        listFibonacci(n);
        System.out.println("------------------------");

        int fib = fibonacci(n);
        System.out.println("The " + n + "-th fibonacci number is: " + fib) ;
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return -1;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void listFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

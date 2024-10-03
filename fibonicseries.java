import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Print the Fibonacci series
            System.out.println("Fibonacci Series up to " + n + " terms:");

            // First two Fibonacci numbers
            int a = 0, b = 1;

            // Loop to print the Fibonacci series
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int nextTerm = a + b; // Calculate the next term
                a = b; // Update a to the next term
                b = nextTerm; // Update b to the next term
            }
        }

        // Close the scanner
        scanner.close();
    }
}


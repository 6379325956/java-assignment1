import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        // Display original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display values after swapping with temp variable
        System.out.println("After swapping with temp: a = " + a + ", b = " + b);

        // Swapping back to original values for demonstration
        temp = a;
        a = b;
        b = temp;

        // Swapping without a temporary variable
        a = a + b; // Now a holds the sum of a and b
        b = a - b; // Subtracting b from sum gives original a
        a = a - b; // Subtracting new b gives original b

        // Display values after swapping without temp variable
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);

        // Close the scanner
        scanner.close();
    }
}

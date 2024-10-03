import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a natural number N: ");
        int n = scanner.nextInt();
        
        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Calculate the sum of the first N natural numbers
            int sum = (n * (n + 1)) / 2;
            
            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}

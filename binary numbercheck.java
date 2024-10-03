import java.util.Scanner;

public class BinaryNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();
        
        // Check if the input is a binary number
        if (isBinary(input)) {
            System.out.println(input + " is a binary number.");
        } else {
            System.out.println(input + " is not a binary number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if the input string is a binary number
    public static boolean isBinary(String str) {
        for (char ch : str.toCharArray()) {
            if (ch != '0' && ch != '1') {
                return false; // Found a character that is not '0' or '1'
            }
        }
        return true; // All characters are '0' or '1'
    }
}

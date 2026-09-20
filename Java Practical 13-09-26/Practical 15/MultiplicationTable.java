import java.util.Scanner; // Import the Scanner class to read user input

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();
        
        System.out.println("\nMultiplication Table of " + num + ":");
        System.out.println("---------------------------------");
        
        // For loop running from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Calculate product and print in standard format (e.g., 5 x 1 = 5)
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        // Close the scanner object
        scanner.close();
    }
}

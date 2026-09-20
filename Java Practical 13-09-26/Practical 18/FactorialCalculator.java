import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Use long because factorials grow very quickly
        long factorial = 1; 
        
        // Check if the input is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Equivalent to: factorial = factorial * i;
            }
            
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}

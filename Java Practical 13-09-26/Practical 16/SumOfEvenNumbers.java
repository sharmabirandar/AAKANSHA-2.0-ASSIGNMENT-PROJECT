import java.util.Scanner; // Import the Scanner class to read user input

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of n
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
        
        int sum = 0; // Variable to accumulate the sum
        
        // For loop stepping by 2 to jump directly to the next even number
        for (int i = 2; i <= n; i += 2) {
            sum += i; // Add the current even number to sum
        }
        
        // Print the final accumulated sum
        System.out.println("The sum of all even numbers from 1 to " + n + " is: " + sum);
        
        // Close the scanner object
        scanner.close();
    }
}

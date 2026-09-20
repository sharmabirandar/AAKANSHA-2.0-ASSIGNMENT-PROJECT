import java.util.Scanner; // Import the Scanner class to read user input

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true; // Assume the number is prime initially
        
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 up to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Factor found, so it's not a prime number
                    break;           // Exit the loop early for efficiency
                }
            }
        }
        
        // Output the final result based on the boolean flag
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
        
        // Close the scanner object
        scanner.close();
    }
}

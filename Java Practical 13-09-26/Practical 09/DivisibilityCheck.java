import java.util.Scanner; // Import the Scanner class to read user input

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is perfectly divisible by both 5 and 10
        if (number % 5 == 0 && number % 10 == 0) {
            System.out.println(number + " is divisible by both 5 and 10.");
        } else {
            System.out.println(number + " is NOT divisible by both 5 and 10.");
        }
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

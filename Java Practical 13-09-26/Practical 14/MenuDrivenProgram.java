import java.util.Scanner; // Import the Scanner class to read user input

public class MenuDrivenProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display the interactive menu options
        System.out.println("=== INTERACTIVE MENU ===");
        System.out.println("1. Check Even or Odd");
        System.out.println("2. Check Positive or Negative");
        System.out.println("3. Find Square and Cube");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        // Switch-case block to execute based on user selection
        switch (choice) {
            case 1:
                System.out.print("Enter an integer: ");
                int evenOddNum = scanner.nextInt();
                if (evenOddNum % 2 == 0) {
                    System.out.println(evenOddNum + " is an Even number.");
                } else {
                    System.out.println(evenOddNum + " is an Odd number.");
                }
                break;
                
            case 2:
                System.out.print("Enter a number: ");
                double posNegNum = scanner.nextDouble();
                if (posNegNum > 0) {
                    System.out.println(posNegNum + " is a Positive number.");
                } else if (posNegNum < 0) {
                    System.out.println(posNegNum + " is a Negative number.");
                } else {
                    System.out.println("The number is Zero.");
                }
                break;
                
            case 3:
                System.out.print("Enter a number: ");
                double num = scanner.nextDouble();
                double square = num * num;
                double cube = num * num * num;
                System.out.println("Square of " + num + " is: " + square);
                System.out.println("Cube of " + num + " is: " + cube);
                break;
                
            case 4:
                System.out.println("Exiting the program. Thank you!");
                break;
                
            default:
                // Triggers if user types an invalid menu choice
                System.out.println("Invalid choice! Please select a valid option between 1 and 4.");
                break;
        }
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}

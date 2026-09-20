import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int originalNumber = number; // Store original value for display
        int reversed = 0;
        
        // Loop runs until the number becomes 0
        while (number != 0) {
            int digit = number % 10;     // Extract the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            number = number / 10;        // Remove the last digit from the number
        }
        
        System.out.println("The reverse of " + originalNumber + " is: " + reversed);
        
        scanner.close();
    }
}

import java.util.Scanner; // Import the Scanner class to read user input

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Prompt the user to enter their citizenship status
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();
        
        // Check both conditions using the logical AND (&&) operator
        if (age >= 18 && isCitizen) {
            System.out.println("You are ELIGIBLE to vote.");
        } else {
            // Provide feedback based on what criteria was missing
            if (age < 18 && !isCitizen) {
                System.out.println("NOT ELIGIBLE: You must be at least 18 years old and a citizen.");
            } else if (age < 18) {
                System.out.println("NOT ELIGIBLE: You must be at least 18 years old.");
            } else {
                System.out.println("NOT ELIGIBLE: You must be a citizen to vote.");
            }
        }
        
        // Close the scanner object
        scanner.close();
    }
}

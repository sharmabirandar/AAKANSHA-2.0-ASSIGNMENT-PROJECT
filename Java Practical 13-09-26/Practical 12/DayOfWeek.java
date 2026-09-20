import java.util.Scanner; // Import the Scanner class to read user input

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();
        
        // Switch-case to map the number to the corresponding day
        switch (dayNumber) {
            case 1:
                System.out.println("Day 1 is Monday");
                break;
            case 2:
                System.out.println("Day 2 is Tuesday");
                break;
            case 3:
                System.out.println("Day 3 is Wednesday");
                break;
            case 4:
                System.out.println("Day 4 is Thursday");
                break;
            case 5:
                System.out.println("Day 5 is Friday");
                break;
            case 6:
                System.out.println("Day 6 is Saturday");
                break;
            case 7:
                System.out.println("Day 7 is Sunday");
                break;
            default:
                // This executes if the user enters any number outside the 1-7 range
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }
        
        // Close the scanner object
        scanner.close();
    }
}

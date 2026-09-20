import java.util.Scanner; // Import the Scanner class to read user input

public class DaysInMonth {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a month number
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        
        // Switch-case using fall-through to group months with identical day counts
        switch (month) {
            // Months with 31 days: Jan, Mar, May, Jul, Aug, Oct, Dec
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days.");
                break;
                
            // Months with 30 days: Apr, Jun, Sep, Nov
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days.");
                break;
                
            // February
            case 2:
                System.out.println("February has 28 days (or 29 days in a leap year).");
                break;
                
            default:
                // Catch-all safety net for out-of-range numbers
                System.out.println("Invalid input! Please enter a month number between 1 and 12.");
                break;
        }
        
        // Close the scanner object
        scanner.close();
    }
}

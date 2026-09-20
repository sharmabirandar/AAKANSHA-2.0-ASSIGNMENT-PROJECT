import java.util.Scanner; // Import the Scanner class to read user input

public class ElectricityBill {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the total units consumed
        System.out.print("Enter the electricity units consumed: ");
        double units = scanner.nextDouble();
        
        double billAmount = 0.0;
        
        // Else-if ladder to check tiered billing consumption slabs
        if (units < 0) {
            System.out.println("Invalid input! Units consumed cannot be negative.");
            scanner.close();
            return; // Exit program early if input is invalid
        } else if (units <= 100) {
            billAmount = units * 1.50;
        } else if (units <= 200) {
            billAmount = (100 * 1.50) + ((units - 100) * 2.50);
        } else if (units <= 300) {
            billAmount = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.00);
        } else {
            billAmount = (100 * 1.50) + (100 * 2.50) + (100 * 4.00) + ((units - 300) * 5.50);
        }
        
        // Print the final calculated bill amount
        System.out.printf("Total Electricity Bill: ₹%.2f\n", billAmount);
        
        // Close the scanner object
        scanner.close();
    }
}

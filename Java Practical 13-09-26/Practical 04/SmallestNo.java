import java.util.Scanner; // Import the Scanner class to read user input

public class SmallestNo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int smallest;
        
        // Nested if-else logic to find the smallest number
        if (num1 <= num2) {
            // If num1 is less than or equal to num2, compare num1 with num3
            if (num1 <= num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else {
            // If num2 is less than num1, compare num2 with num3
            if (num2 <= num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }
        
        // Print the result
        System.out.println("The smallest number is: " + smallest);
        
        // Close the scanner object
        sc.close();
    }
}

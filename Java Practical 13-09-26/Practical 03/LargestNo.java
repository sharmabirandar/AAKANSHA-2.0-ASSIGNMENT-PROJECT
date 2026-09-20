import java.util.Scanner; // Import the Scanner class to read user input

public class LargestNo {
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
        
        int largest;
        
        // Nested if-else logic to find the largest number
        if (num1 >= num2) {
            // If num1 is greater than or equal to num2, compare num1 with num3
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            // If num2 is greater than num1, compare num2 with num3
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        
        // Print the result
        System.out.println("The largest number is: " + largest);
        
        // Close the scanner object
        sc.close();
    }
}


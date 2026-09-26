import java.util.Scanner;

public class SearchAndPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // 1. Input 10 integers into the array
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // 2. Input the target number to search for
        System.out.print("Enter the number to search: ");
        int searchElement = sc.nextInt();

        int firstIndex = -1; // Initialised to -1 to signify "not found"
        int totalOccurrences = 0;

        // 3. Search through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                // If it's the first time finding the element, lock in the index
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                totalOccurrences++;
            }
        }

        // 4. Display results based on whether it was found
        System.out.println("\n--- Search Results ---");
        if (firstIndex != -1) {
            System.out.println("Status: The number " + searchElement + " exists in the array.");
            System.out.println("First position (Index): " + firstIndex);
            System.out.println("Number of times it occurs: " + totalOccurrences);
        } else {
            System.out.println("Status: The number " + searchElement + " was not found in the array.");
        }

        sc.close();
    }
}

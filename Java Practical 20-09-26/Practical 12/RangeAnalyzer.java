import java.util.Scanner;

public class RangeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        int difference = largest - smallest;

        System.out.println("\n--- Analysis Results ---");
        System.out.println("Largest Number : " + largest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Difference     : " + difference);

        if (difference > 50) {
            System.out.println("Range Status   : Greater than 50");
        } else if (difference >= 20 && difference <= 50) {
            System.out.println("Range Status   : Between 20 and 50");
        } else {
            System.out.println("Range Status   : Less than 20");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class NumberSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[15]; 

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        int positiveSum = 0;
        int negativeSum = 0;

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
                positiveSum += numbers[i];
            } else if (numbers[i] < 0) {
                negativeCount++;
                negativeSum += numbers[i];
            } else {
                zeroCount++;
            }
        }

        System.out.println("\n--- Categorised Numbers ---");
        
        System.out.print("Positive numbers: ");
        for (int num : numbers) {
            if (num > 0) System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Negative numbers: ");
        for (int num : numbers) {
            if (num < 0) System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Zeros: ");
        for (int num : numbers) {
            if (num == 0) System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("--- Summary Statistics ---");
        System.out.println("Count of Positive Numbers: " + positiveCount);
        System.out.println("Count of Negative Numbers: " + negativeCount);
        System.out.println("Count of Zeros           : " + zeroCount);
        System.out.println("Sum of Positive Numbers  : " + positiveSum);
        System.out.println("Sum of Negative Numbers  : " + negativeSum);

        sc.close();
    }
}

import java.util.Scanner;

public class EvenOddStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        int countEven = 0;
        int countOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0) {
                countEven++;
                sumEven += numbers[i];
            } else {
                countOdd++;
                sumOdd += numbers[i];
            }
        }
        
        System.out.print("All even numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        System.out.print("All odd numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        
        scanner.close();
    }
}

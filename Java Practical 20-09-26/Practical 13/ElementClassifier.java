import java.util.Scanner;

public class ElementClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int;

        // Counters for each category
        int posEvenCount = 0;
        int posOddCount = 0;
        int negEvenCount = 0;
        int negOddCount = 0;
        int zeroCount = 0;

        // 1. Input 15 integers into the array
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            // 2. Classify on the fly using conditional logic
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    posEvenCount++;
                } else {
                    posOddCount++;
                }
            } else if (numbers[i] < 0) {
                if (numbers[i] % 2 == 0) {
                    negEvenCount++;
                } else {
                    negOddCount++;
                }
            } else {
                zeroCount++;
            }
        }

        // 3. Display the final classification counts
        System.out.println("\n--- Classification Summary ---");
        System.out.println("Positive Even : " + posEvenCount);
        System.out.println("Positive Odd  : " + posOddCount);
        System.out.println("Negative Even : " + negEvenCount);
        System.out.println("Negative Odd  : " + negOddCount);
        System.out.println("Zero          : " + zeroCount);

        sc.close();
    }
}

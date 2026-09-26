import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        boolean[] counted = new boolean[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nDuplicate elements and their frequencies:");
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            if (counted[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true;
                }
            }

            if (count > 1) {
                System.out.println("Element: " + arr[i] + " | Frequency: " + count);
                hasDuplicate = true;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate elements found.");
        }
        sc.close();
    }
}

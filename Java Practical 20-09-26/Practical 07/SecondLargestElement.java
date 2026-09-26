import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num1 : num) {
            if (num1 > largest) {
                secondLargest = largest;
                largest = num1;
            } else if (num1 > secondLargest && num1 != largest) {
                secondLargest = num1;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("\nThere is no distinct second largest element (all elements might be equal).");
        } else {
            System.out.println("\nThe largest element is: " + largest);
            System.out.println("The second largest element is: " + secondLargest);
        }

        sc.close();
    }
}


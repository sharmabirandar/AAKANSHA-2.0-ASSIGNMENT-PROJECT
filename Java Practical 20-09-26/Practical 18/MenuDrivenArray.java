import java.util.Scanner;

public class MenuDrivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display all elements");
            System.out.println("2. Find largest");
            System.out.println("3. Find smallest");
            System.out.println("4. Calculate sum");
            System.out.println("5. Calculate average");
            System.out.println("6. Count even numbers");
            System.out.println("7. Count odd numbers");
            System.out.println("8. Search an element");
            System.out.println("9. Exit");
            System.out.print("Enter your choice (1-9): ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Array elements: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max) max = num;
                    }
                    System.out.println("Largest element: " + max);
                    break;
                    
                case 3:
                    int min = arr[0];
                    for (int num : arr) {
                        if (num < min) min = num;
                    }
                    System.out.println("Smallest element: " + min);
                    break;
                    
                case 4:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum of elements: " + sum);
                    break;
                    
                case 5:
                    int totalSum = 0;
                    for (int num : arr) {
                        totalSum += num;
                    }
                    double avg = (double) totalSum / arr.length;
                    System.out.println("Average of elements: " + avg);
                    break;
                    
                case 6:
                    int evenCount = 0;
                    for (int num : arr) {
                        if (num % 2 == 0) evenCount++;
                    }
                    System.out.println("Count of even numbers: " + evenCount);
                    break;
                    
                case 7:
                    int oddCount = 0;
                    for (int num : arr) {
                        if (num % 2 != 0) oddCount++;
                    }
                    System.out.println("Count of odd numbers: " + oddCount);
                    break;
                    
                case 8:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == key) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                    break;
                    
                case 9:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select between 1 and 9.");
            }
        } while (choice != 9);
        
        sc.close();
    }
}

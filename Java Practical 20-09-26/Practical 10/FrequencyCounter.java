import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchElement = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                count++;
            }
        }
        
        System.out.println(searchElement + " occurs " + count + " times.");
        
        sc.close();
    }
}

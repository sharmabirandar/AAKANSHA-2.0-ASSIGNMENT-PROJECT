import java.util.Scanner;

public class ArrayResultProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        
        int highest = Integer.MIN_VALUE, highIndex = -1;
        int lowest = Integer.MAX_VALUE, lowIndex = -1;
        int sum = 0;
        
        int count75 = 0, count60_74 = 0, count40_59 = 0, failed = 0;

        System.out.println("Enter marks of 10 students (out of 100):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + i + ": ");
            marks[i] = sc.nextInt();
            
            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
                highIndex = i;
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
                lowIndex = i;
            }

            if (marks[i] >= 75) count75++;
            else if (marks[i] >= 60) count60_74++;
            else if (marks[i] >= 40) count40_59++;
            else failed++;
        }

        double average = (double) sum / 10;

        System.out.println("\n--- Results ---");
        System.out.println("Highest marks: " + highest + " at index " + highIndex);
        System.out.println("Lowest marks: " + lowest + " at index " + lowIndex);
        System.out.println("Average marks: " + average);
        System.out.println("Number of students scoring ≥ 75: " + count75);
        System.out.println("Number of students scoring 60–74: " + count60_74);
        System.out.println("Number of students scoring 40–59: " + count40_59);
        System.out.println("Number of failed students (<40): " + failed);
        
        sc.close();
    }
}

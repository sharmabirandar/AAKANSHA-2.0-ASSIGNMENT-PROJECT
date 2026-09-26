import java.util.Scanner;
public class StudentMarkAnaly {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];

        System.out.println("Enter the marks of 10 Sudents: ");
        for(int i = 0;i<10;i++){
            marks[i] = sc.nextInt();
        }
        int highest = marks[0];
        int lowest = marks[0];
        int totalMarks = 0;
        int passedCount = 0;
        int failedCount = 0;
        
        for (int mark : marks ) {
            if (mark > highest) {
                highest = mark;
            }
            
            if (mark < lowest) {
                lowest = mark;
            }
            
            totalMarks += mark;
            if (mark >= 40) {
                passedCount++;
            } else {
                failedCount++;
            }
        }
        double average = (double) totalMarks / marks.length;
        
        System.out.println("\n--- Student Marks Analysis ---");
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Average Marks: " + average);
        System.out.println("Number of Students Passed: " + passedCount);
        System.out.println("Number of Students Failed: " + failedCount);
        
        sc.close();
    }
}

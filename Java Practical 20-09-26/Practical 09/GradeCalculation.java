import java.util.Scanner; 

public class GradeCalculation { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[] marks = new int[5]; 
        int total = 0; 
        boolean passedAllSubjects = true; 

        System.out.println("Enter marks of 5 Subjects: "); 
        for (int i = 0; i < marks.length; i++) { 
            marks[i] = sc.nextInt(); 
            
            total += marks[i]; 
            if (marks[i] < 40) { 
                passedAllSubjects = false; 
            } 
        } 
        double percentage = (double) total / marks.length; 
        String grade; 

        if (percentage >= 90) { 
            grade = "A+"; 
        } else if (percentage >= 80) { 
            grade = "A"; 
        } else if (percentage >= 70) { 
            grade = "B"; 
        } else if (percentage >= 60) { 
            grade = "C"; 
        } else if (percentage >= 50) { 
            grade = "D"; 
        } else if (percentage >= 40) { 
            grade = "E"; 
        } else { 
            grade = "F"; 
        } 

        System.out.println("\n--- Results ---"); 
        System.out.printf("Total Marks: %d\n", total); 
        System.out.printf("Percentage: %.2f%%\n", percentage); 
        System.out.println("Assigned Grade: " + grade); 

        if (passedAllSubjects) { 
            System.out.println("Status: Congratulations! The student has passed all subjects."); 
        } else { 
            System.out.println("Status: The student did not pass all subjects (scored below 40 in at least one subject)."); 
        } 
        sc.close(); 
    }
}

import java.util.Scanner;
public class ExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter attendance percentage (0-100): ");
        double attendance = sc.nextDouble();
        
        System.out.print("Enter internal assessment marks (0-100): ");
        double marks =sc.nextDouble();
        
        if (attendance >= 75.0) {

            if (marks >= 40.0) {
                System.out.println("Status: ELIGIBLE. The student meets both attendance and marks requirements.");
            } else {
                System.out.println("Status: NOT ELIGIBLE. Attendance is sufficient, but internal marks are too low.");
            }
            
        } else {
            System.out.println("Status: NOT ELIGIBLE. Attendance is below the required 75%.");
        }
    
        scanner.close();
    }
}

import java.util.Scanner;

public class Students {
  
    public void studentMarks(int sub1, int sub2, int sub3){
       int total=sub1+sub2+sub3;
       double avg=total/3;

       System.out.println("Your Total marks is : " +total);
       System.out.println("Your Avarage is : "+avg);
    }
    public static void main(String[] args) {
        Students obj = new Students();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Subject Mark : ");
        int sub1 = sc.nextInt();

        System.out.println("Enter the Second Subject Mark : ");
        int sub2 = sc.nextInt();

        System.out.println("Enter the Third Subject Mark : ");
        int sub3 = sc.nextInt();

        obj.studentMarks(sub1, sub2, sub3);
        sc.close();
    }
}

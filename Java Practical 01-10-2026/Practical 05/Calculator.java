import java.util.Scanner;

public class Calculator{
    public double addition(double a, double b){
       return a+b;
    }
    public double substraction(double a, double b){
        return a-b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice(1,2,3,4) : ");
        int option = sc.nextInt();

        System.out.println("Enter the first No: ");
        double a = sc.nextDouble();

        System.out.println("Enter the Second No: ");
        double b = sc.nextDouble();

        switch(option){
            case 1: System.out.println("Addition is : " +obj.addition(a,b));
            break;
            case 2: System.out.println("Substraction is : " +obj.substraction(a, b));
            break;
            case 3: System.out.println("Multiplication is : " +obj.multiplication(a, b));
            break;
            case 4: System.out.println("Division is : " +obj.division(a,b));
            break;
            default: System.out.println("Enter Valid Option...");
            break;
        }
        sc.close();
    }
}
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char c = scanner.next().charAt(0);
        
        double result;
        
        switch (c) {
            case '+':
                result = a + b;
                System.out.println("Result: " + a + " + " + b + " = " + result);
                break;
                
            case '-':
                result = a - b;
                System.out.println("Result: " + a + " - " + b + " = " + result);
                break;
                
            case '*':
                result = a * b;
                System.out.println("Result: " + a + " * " + b + " = " + result);
                break;
                
            case '/':
                    result = a / b;
                    System.out.println("Result: " + a + " / " + b + " = " + result);
                break;
                
            case '%':
                    result = a % b;
                    System.out.println("Result: " + a + " % " + b + " = " + result);
                break;
                
            default:
                System.out.println("Error: Invalid operator! Please use +, -, *, /, or %.");
                break;
        }
        scanner.close();
    }
}

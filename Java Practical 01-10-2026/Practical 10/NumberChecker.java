import java.util.Scanner;

public class NumberChecker {
    
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
    
    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }
    
    public static boolean isPositive(int a) {
        return a > 0;
    }
    
    public static boolean isNegative(int a) {
        return a < 0;
    }
    
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            
            System.out.println("Is Even: " + isEven(a));
            System.out.println("Is Odd: " + isOdd(a));
            System.out.println("Is Positive: " + isPositive(a));
            System.out.println("Is Negative: " + isNegative(a));
            
            if (isPrime(a)) {
                System.out.println(a + " is a prime number.");
            } else {
                System.out.println(a + " is not a prime number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        sc.close();
    }
}
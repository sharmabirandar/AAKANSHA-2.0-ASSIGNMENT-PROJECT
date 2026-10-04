import java.util.Scanner;

class Calculatorr {

    // Overloaded method for adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for adding two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculatorr obj = new Calculatorr();
        Scanner sc = new Scanner(System.in);
        int opt;

        System.out.println("Welcome to Overloaded Calculator System");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Two Integers");
            System.out.println("2. Add Three Integers");
            System.out.println("3. Add Two Double Values");
            System.out.println("4. Exit");
            System.out.print("What do you want to do? ");
            
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter first integer: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + obj.add(num1, num2));
                    break;

                case 2:
                    System.out.print("Enter first integer: ");
                    int x = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int y = sc.nextInt();
                    System.out.print("Enter third integer: ");
                    int z = sc.nextInt();
                    System.out.println("Result: " + obj.add(x, y, z));
                    break;

                case 3:
                    System.out.print("Enter first double value: ");
                    double d1 = sc.nextDouble();
                    System.out.print("Enter second double value: ");
                    double d2 = sc.nextDouble();
                    System.out.println("Result: " + obj.add(d1, d2));
                    break;

                case 4:
                    System.out.println("Thank you for using the Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please choose between 1 and 4.");
            }
        } while (opt != 4);

        sc.close();
    }
}
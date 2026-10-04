import java.util.Scanner;

class Temperature {

    // Method to convert Celsius to Fahrenheit
    double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Temperature obj = new Temperature();
        Scanner sc = new Scanner(System.in);
        int opt;

        System.out.println("Welcome to Temperature Converter System");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("What do you want to do? ");
            
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheitResult = obj.celsiusToFahrenheit(celsius);
                    System.out.println(celsius + "°C is equal to " + String.format("%.2f", fahrenheitResult) + "°F");
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    double celsiusResult = obj.fahrenheitToCelsius(fahrenheit);
                    System.out.println(fahrenheit + "°F is equal to " + String.format("%.2f", celsiusResult) + "°C");
                    break;

                case 3:
                    System.out.println("Thank you for using the Temperature Converter. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please choose between 1 and 3.");
            }
        } while (opt != 3);

        sc.close();
    }
}
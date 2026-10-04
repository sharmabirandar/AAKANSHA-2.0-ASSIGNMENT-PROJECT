import java.util.Scanner;

class Product {
    String productName;
    double price;
    double discountPercentage;

    // Method to set product details
    void setProductDetails(String name, double originalPrice, double discount) {
        productName = name;
        price = originalPrice;
        discountPercentage = discount;
    }

    // Method to calculate discount amount
    double calculateDiscount() {
        return (price * discountPercentage) / 100.0;
    }

    // Method to calculate final selling price
    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    // Method to display full product info
    void displayProductInfo() {
        System.out.println("\n--- Product Summary ---");
        System.out.println("Product Name      : " + productName);
        System.out.println("Original Price    : $" + price);
        System.out.println("Discount Rate     : " + discountPercentage + "%");
        System.out.println("Discount Amount   : $" + calculateDiscount());
        System.out.println("Final Selling Price: $" + calculateFinalPrice());
    }

    public static void main(String[] args) {
        Product obj = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Product Pricing System");
        
        // Taking inputs from the user
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Original Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        // Initializing the object with user data
        obj.setProductDetails(name, price, discount);

        int opt;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Calculate Discount Amount");
            System.out.println("2. Calculate Final Selling Price");
            System.out.println("3. Display All Product Info");
            System.out.println("4. Exit");
            System.out.print("What do you want to do? ");
            
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Discount Amount : $" + obj.calculateDiscount());
                    break;

                case 2:
                    System.out.println("Final Selling Price : $" + obj.calculateFinalPrice());
                    break;

                case 3:
                    obj.displayProductInfo();
                    break;

                case 4:
                    System.out.println("Thank you! Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option! Please choose between 1 and 4.");
            }
        } while (opt != 4);

        sc.close();
    }
}
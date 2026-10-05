public class ShoppingCart {
    String name;
    double price;
    int quantity;

    ShoppingCart(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    public double totalPrice() {
        return price * quantity;
    }

    public double discount() {
        return totalPrice() * (27.0 / 100.0);
    }

    public void displayBill() {
        double subtotal = totalPrice();
        double discountAmount = discount();
        double finalTotal = subtotal - discountAmount;

        System.out.println("--- Final Bill ---");
        System.out.println("Product Name: " + name);
        System.out.println("Discount (27%): " + discountAmount);
        System.out.println("Final Total: " + finalTotal);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Laptop", 99999.00, 2);
        cart.displayBill();
    }
}

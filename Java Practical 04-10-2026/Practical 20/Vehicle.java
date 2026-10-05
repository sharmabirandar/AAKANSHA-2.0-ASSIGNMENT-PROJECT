public class Vehicle {
    String number ;
    String model;
    double rentalPricePerDay;

    Vehicle(String n, String m, double r){
        number = n;
        model = m;
        rentalPricePerDay = r;
    }

    double rentalAmount(int day){
        return rentalPricePerDay*day;
    }

    double rentalAmountDiscount(int day){
          if (day > 5) {
            return rentalAmount(day) * (10.0 / 100.0);
        }
        return 0.0;
    }

    public void displayRentalBill(int days) {
        double subtotal = rentalAmount(days);
        double discountAmount = rentalAmountDiscount(days);
        double finalTotal = subtotal - discountAmount;

        System.out.println("--- Rental Bill ---");
        System.out.println("Vehicle Number : " + number);
        System.out.println("Vehicle Model  : " + model);
        System.out.println("Rental Days    : " + days);
        System.out.println("Subtotal       : " + subtotal);
        System.out.println("Discount       : " + discountAmount);
        System.out.println("Final Total    : " + finalTotal);
    }

     public static void main(String[] args) {
        Vehicle car = new Vehicle("OD-11-A-1234", "Mahindra XUV700", 80.00);
        car.displayRentalBill(7);
    }
}

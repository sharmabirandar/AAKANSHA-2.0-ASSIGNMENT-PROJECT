import java.util.Scanner;

public class Car {
    String carBrand = "Volkswagen";
    String carName = "POLO GT";
    String colour = "Red";

    public void Start(){
        System.out.println("The Car Is Starting.......");
    }
    public void stop(){
        System.out.println("The Car Is Stopping.......");
    }
    public void carDetail(){
        System.out.println("Car Brand is : " +carBrand);
        System.out.println("Car Name is : "+carName);
        System.out.println("Colour of the Car is : "+colour);
    }

    public static void main(String[] args) {
        Car obj = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("------Welcome------");
        System.out.println("1.Start the car");
        System.out.println("2.Stop the car");
        System.out.println("3.Show the car Details");
        System.out.println("Choose from the Options(1,2,3) : ");
        int option = sc.nextInt();

        switch(option){
            case 1 : obj.Start();
            break;
            case 2 : obj.stop();
            break;
            case 3 : obj.carDetail();
            break;
            default : System.out.println("Invalid.... Choose the Right option");
            break;
        }
        sc.close();
    }
}


//created by vyomesh shukla at 9:44 
public class car {
private String brand;
private String model;
public car(String brand, String model) {
    this.brand = brand;
    this.model = model;
}
public void displayDetails() {
    System.out.println("Car Brand: " + brand);
    System.out.println("Car Model: " + model);
}
public void startEngine() {
    System.out.println("key inserted ");
    System.out.println("ignition turned");

    System.out.println("The engine of " + brand + " " + model + " is starting...");
}







}

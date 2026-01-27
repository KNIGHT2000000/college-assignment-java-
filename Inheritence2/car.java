public class car extends vehicle {
    String model;
    String brand;
    int year;

    void displayInfo(){
        System.out.println("Car Model: "+model);
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Year: "+year);
    }
    @Override
    void drive(){
        System.out.println("Car is driving");
    }


}

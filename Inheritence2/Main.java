public class Main {
    public static void main(String[] args) {
        vehicle v=new vehicle();
    v.start();
      v.drive();
    v.stop();
  
    v.color="Red";
    System.out.println("Vehicle color: "+v.getColor());
    

    car c=new car();
    c.model="Model S";
    c.brand="Tesla";
    c.year=2022;
    c.displayInfo();
    c.start();
    c.drive();
   
    c.stop();

    
        


}}

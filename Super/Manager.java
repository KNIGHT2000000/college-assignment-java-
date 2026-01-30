

public class Manager extends Employee 
{
    Manager(){
        super();
        System.out.println("This is Manager constructor");
    }
void work() {
    super.work();
    System.out.println("Manager is managing.");
    }


}

// class Employee {
//     Employee() {
//         System.out.println("This is Employee constructor");
//     }

//     void work() {
//         System.out.println("Employee is working.");
//     }
// }

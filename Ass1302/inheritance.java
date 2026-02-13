//Problem Statement:
//Create a base class called Employee with the following:
//•	Data members: name, id, salary
//•	Method: displayEmployeeDetails()
//Create a derived class Manager that:
//•	Adds: bonus
//•	Method: calculateTotalSalary() (salary + bonus)
//•	Displays full details including total salary
//Requirements:
//1.	Use constructors to initialize values.
//2.	Create objects in the main() method and demonstrate output.




public static void  Employee{
    private String name;
    private int id;
    private double salary;
    Employee(String name, int id, double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;}
    public void displayEmployeeDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);

        }




        }
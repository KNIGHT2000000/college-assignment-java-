public class Manage1r extends Employee1 {
    private double bonus;

    public Manage1r(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void calculateTotalSalary() {
        double totalSalary = this.salary + bonus;
        System.out.println("Total Salary: " + totalSalary);
    }

    public void displayManagerDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        calculateTotalSalary();
    }
}
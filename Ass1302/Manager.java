public void manager extends Employee{
    private double bonus;
    manager(String name, int id, double salary, double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void calculateTotalSalary(){
        double totalSalary = super.salary + bonus;
        System.out.println("Total Salary: " + totalSalary);
    }
    public void displayManagerDetails(){
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        calculateTotalSalary();
    }
}
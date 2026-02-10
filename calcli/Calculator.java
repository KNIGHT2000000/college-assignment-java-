public class Calculator {
    
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Add two floats
    public float add(float a, float b) {
        return a + b;
    }
    
    // Concatenate two strings (simulating addition)
    public String add(String a, String b) {
        return a + b;
    }
    //subtract two integers
    public int subtract(int a, int b) {
        if(a>b){
            return a - b;
        }
        else{
        return b - a;}
    }
    public float subtract(float a, float b) {
        if(a>b){
            return a - b;
        }
        else{
        return b - a;}
    }
    public double subtract(double a, double b) {
        if(a>b){
            return a - b;
        }
        else{
        return b - a;}
    }



    // Main method to demonstrate function overloading
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling overloaded add methods
        System.out.println("Add two integers (5 + 10): " + calc.add(5, 10));
        System.out.println("Add three integers (5 + 10 + 15): " + calc.add(5, 10, 15));
        System.out.println("Add two doubles (5.5 + 10.5): " + calc.add(5.5, 10.5));
        System.out.println("Add two floats (5.5f + 10.5f): " + calc.add(5.5f, 10.5f));
        System.out.println("Add two strings ('Hello' + ' World'): " + calc.add("Hello", " World"));
    }
}

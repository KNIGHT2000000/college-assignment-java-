

public class Main {
    public static void main(String[] args) {
      
     
        Outer o=new Outer();
        Outer.Inner n=o.new Inner();
        n.display();    
        int result=o.add(5,10);
        System.out.println("Addition: "+result);



}}

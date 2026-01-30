

public class tiger extends Animal {

    tiger(){
        super();
        System.out.println("This is tiger constructor");
    }
    void display() {
        super.eat();
        System.out.println("This is a tiger.");
    }

}

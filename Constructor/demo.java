public class demo {
    static int count=0; 
    demo(){

        this("vyom vyom");

    }

    demo(String name){
        count++;
        System.out.println(name + " object created. Count: " + count);
    }
}

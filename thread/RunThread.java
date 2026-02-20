package thread;

public class RunThread {
    public static void main(String[] args) {
//        thread1 t1 = new thread1();
//        thread1 t2 = new thread1(); /// this is the old way to create thread by extending Thread class,
//        but it is not recommended because of the single inheritance in java, we can not extend any other class if we extend Thread class
        Runnable_demo r1 = new Runnable_demo();
        Runnable_demo r2 = new Runnable_demo();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
   t1.start();
        t2.start();
//        t1.run();
//        t2.run();
//

    }
}

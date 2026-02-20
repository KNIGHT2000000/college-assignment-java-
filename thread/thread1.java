package thread;

public class thread1 extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread " + Thread.currentThread().getId() + "is running " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("thread " + Thread.currentThread().getName() + "is interrupted");
            }

        }
    }


}
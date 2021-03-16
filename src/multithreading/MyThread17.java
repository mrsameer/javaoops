/*
 Demonstration of interruption of sleeping thread
 */
package multithreading;

public class MyThread17 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am lazy thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("i got interrupted");
        }
    }
}

class MyThread17Demo {
    public static void main(String[] args) {
        MyThread17 t = new MyThread17();
        t.start();
        t.interrupt();  // main thread interrupts child thread
        System.out.println("End of main");
    }
}
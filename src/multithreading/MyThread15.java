/*
 Demonstration of both main and child threads are waiting for each others to complete their executions
 Here Deadlock situation occurs
 */
package multithreading;

public class MyThread15 extends Thread{
    static Thread mt;  // to assign main thread to this variable

    @Override
    public void run() {
        try {
            mt.join();  // child thread will wait until completion of main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

class MyThread15Demo {
    public static void main(String[] args) throws InterruptedException{
        MyThread15.mt = Thread.currentThread();
        MyThread15 t = new MyThread15();
        t.start();
        t.join();  // main thread waits for the completion of child thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
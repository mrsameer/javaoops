/*
 Demonstration of how to make main thread to sleep and access main thread in child thread
 */
package multithreading;

public class MyThread14 extends Thread{
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

class MyThread14Demo {
    public static void main(String[] args) throws InterruptedException{
        MyThread14.mt = Thread.currentThread();
        MyThread14 t = new MyThread14();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
/*
Define thread using Runnable interface
 */
package multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Child Thread");
    }
}

class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);  // pass target runnable as argument
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread");
        }
    }
}
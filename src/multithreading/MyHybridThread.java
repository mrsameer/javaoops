/*
 Hybrid approach to define a thread
 */
package multithreading;

public class MyHybridThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

class MyHybridThreadDemo {
    public static void main(String[] args) {
        MyHybridThread t1  = new MyHybridThread();
        Thread t2 = new Thread(t1);
        t2.start();
        System.out.println("Main Thread");
    }
}

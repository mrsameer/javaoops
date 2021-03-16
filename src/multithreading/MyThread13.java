/*
Demonstration of join() method
 */
package multithreading;

public class MyThread13 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){};
        }
    }
}

class MyThread13Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread13 t = new MyThread13();
        t.start();
        t.join(); // main thread waits until child thread completion.
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

class MyThread13Demo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread13 t = new MyThread13();
        t.start();
        t.join(1000);  // main thread will wait for 1000 milliseconds for the completion of its child thread t
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
/*
Defining thread
 */
package multithreading;

// defining thread by extending Thread class
public class MyThread extends Thread{

    //overriding run class
    public void run() {
        // job of thread
        for (int i = 0; i < 10; i++)
            System.out.println("Child Thread");
    }
}

class MyThreadDemo {
    public static void main(String[] args) {
        // main thread creates child thread object
        MyThread t = new MyThread();  // Thread instantiation
        t.start();  // main thread starts child thread.

        // below for loop executed by main thread.
        for (int i = 0 ; i < 10; i++)
            System.out.println("main thread");
    }
}
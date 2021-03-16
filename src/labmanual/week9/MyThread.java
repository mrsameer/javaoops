/*
 7. Write a program to create MyThread class with run () method and then attach a thread to this MyThread class object
 */
package labmanual.week9;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread name is " + Thread.currentThread().getName());  // Thread-0
    }
}

class MyThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // attached a thread to MyThread
    }
}
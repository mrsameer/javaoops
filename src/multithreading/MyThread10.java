/*
 Program to demonstrate Thread priorities
 */
package multithreading;

public class MyThread10 extends Thread{

}

class MyThread10emo {
    public static void main(String[] args) {
        MyThread10 t = new MyThread10();
        System.out.println("Main thread priority is " + Thread.currentThread().getPriority()); // 5
        System.out.println("MyThread10 priority is " + t.getPriority()); // inherits from parent thread (main thread)

        // change the priority of main thread to 1
        Thread.currentThread().setPriority(1);
        System.out.println("Now main Thread priority is " + Thread.currentThread().getPriority()); // 1

        System.out.println("Now MyThread10 priority is " + t.getPriority());  // 5

    }
}

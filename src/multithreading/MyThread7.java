/*
 What if we try to restart the same thread again
 */
package multithreading;

public class MyThread7 extends Thread{

}

class MyThread7Demo {
    public static void main(String[] args) {
        MyThread7 t = new MyThread7();
        t.start();
        t.start();  // gives IllegalThreadStateException
    }
}
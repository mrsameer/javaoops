/*
 Demonstration of what if we do not override run method of Thread class
 */
package multithreading;

public class MyThread4 extends Thread{
}

class MyThread4Demo {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.start();  // no output gets produced as it run super.start() method.
    }
}
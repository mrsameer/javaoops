/*
 Overriding of start() method of Thread class
 */
package multithreading;

public class MyThread5 extends Thread{
    public void start() {
        System.out.println("Start method");
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}

class MyThread5Demo {
    public static void main(String[] args) {
        MyThread5 t = new MyThread5();
        t.start();
    }
}
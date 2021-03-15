/*
overriding start() method with super.start() inside overrided start
only 3 possibilities of output
 */
package multithreading;

public class MyThread6 extends Thread{
    @Override
    public void start() {
        super.start();
        System.out.println("Start method");  // main thread runs this
    }

    @Override
    public void run() {
        System.out.println("run method");  // MyThread thread runs this
    }
}

class MyThread6Demo {
    public static void main(String[] args) {
        MyThread6 t = new MyThread6();
        t.start();
        System.out.println("main thread");  // main thread runs this
    }
}
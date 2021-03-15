package multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

class MyThread2Demo {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.run();  // instead of start main thread runs child thread.

        for (int i = 0; i < 10; i++)
            System.out.println("main thread");
    }
}
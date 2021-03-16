package multithreading;

public class MyThread12 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

class MyThread12Demo {
    public static void main(String[] args) {
        MyThread12 t = new MyThread12();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
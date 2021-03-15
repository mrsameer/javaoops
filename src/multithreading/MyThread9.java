package multithreading;

public class MyThread9 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());  // Thread-0
    }
}

class MyThread9Demo {
    public static void main(String[] args) {
        MyThread9 t = new MyThread9();
        t.start();
        System.out.println(Thread.currentThread().getName());  // main

    }
}

package multithreading;

public class MyThread11 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Child Thread");
    }
}

class MyThread11Demo {
    public static void main(String[] args) {
        MyThread11 t = new MyThread11();
        t.setPriority(10);  // higher priority for t (than main)
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread");
        }
    }
}
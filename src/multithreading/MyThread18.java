package multithreading;

public class MyThread18 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("I am a lazy thread");
        }
        System.out.println("I wanna sleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}

class MyThread18Demo {
    public static void main(String[] args) {
        MyThread18 t = new MyThread18();
        t.start();
        t.interrupt();  // if child thread is not sleeping or waiting, interrupt call won't go waste
        // jvm remembers and interrupts whenever it goes into sleep or wait state...

        System.out.println("End of main");
    }
}

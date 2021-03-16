package multithreading;

class Display {
    public void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {}
            System.out.println(name);
        }
    }
}

class Display2 {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {}
            System.out.println(name);
        }
    }
}

public class MyThread19 extends Thread{
//    Display d;
    Display2 d;
    String name;

//    public MyThread19(Display d, String name) {
//        this.d = d;
//        this.name = name;
//    }

    public MyThread19(Display2 d, String name) {
        this.d = d;
        this.name = name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}

class SynchronizedDemo {
    public static void main(String[] args) {
//        Display d = new Display();
//        MyThread19 t1 = new MyThread19(d, "Dhoni");
//        MyThread19 t2 = new MyThread19(d, "Afridi");
//        t1.start();
//        t2.start();
        Display2 d = new Display2();
        MyThread19 t1 = new MyThread19(d, "Dhoni");
        MyThread19 t2 = new MyThread19(d, "Afridi");
        t1.start();
        t2.start();

    }
}
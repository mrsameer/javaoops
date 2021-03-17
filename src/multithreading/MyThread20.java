/*
 Demonstration of static synchronized method.
 */
package multithreading;

class Display3 {

    // class level lock required for static synchronized method access
    public static synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {}
            System.out.println(name);
        }
    }
}
public class MyThread20 extends Thread{
    Display3 d;
    String name;

    public MyThread20(Display3 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

class MyThread20Demo {

    // even though wish method in Display2 class is synchronized,
    // it produces irregular output as both threads are acting on 2 different objects.
    public static void irregualr(){
        Display2 d1 = new Display2();
        Display2 d2 = new Display2();
        MyThread19 t1 = new MyThread19(d1, "dhoni");
        MyThread19 t2 = new MyThread19(d2, "sachin");
        t1.start();
        t2.start();
    }

    // this produces regular output as wish method is static synchronized and it requires class level lock
    public static void regular() {
        Display3 d1 = new Display3();
        Display3 d2 = new Display3();
        MyThread20 t1 = new MyThread20(d1, "dhoni");
        MyThread20 t2 = new MyThread20(d2, "sachin");
        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
       MyThread20Demo.irregualr();
       MyThread20Demo.regular();
    }
}
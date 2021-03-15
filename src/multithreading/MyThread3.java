/*
 Demonstration of overloading of run method.
 */
package multithreading;

public class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("No args run");
    }

    public void run(int i) {
        System.out.println("int arg run");
    }
}

class MyThread3DDemo {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        t.start(); // always calls no arg run method

        // so as to call arg run method we need to call it as method call only
        t.run(4);
    }
}
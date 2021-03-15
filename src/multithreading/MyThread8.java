package multithreading;

public class MyThread8 extends Thread{

}

class MyThread8Demo {
    public static void main(String[] args) {
        MyThread8 t = new MyThread8();
        System.out.println(Thread.currentThread().getName()); //  main
        System.out.println(t.getName());  // jvm generates name of the Thread and it is Thread-0 at the time of execution here
        Thread.currentThread().setName("Main gaaru");
        System.out.println(Thread.currentThread().getName());  // Main gaaru
    }
}
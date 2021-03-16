/*
 main thread calls join on it's own object.
 */
package multithreading;

public class MyThread16 {
    public static void main(String[] args) throws InterruptedException{
        Thread.currentThread().join();
    }
}

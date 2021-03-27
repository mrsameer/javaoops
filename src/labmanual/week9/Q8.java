/*
8. Write a program where the consumer thread checks the data production status [ is
over or not ] for every 10 ms.
 */
package labmanual.week9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Producer extends Thread{
    BlockingQueue<Integer> bq;

    public Producer() {
        bq = new ArrayBlockingQueue<>(5);  // ArrayBlocking queue with capacity 5
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Producing " + i);
                bq.put(i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Producer p;

    public Consumer(Producer p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            try {
                System.out.println("Consumed " + p.bq.poll(10, TimeUnit.SECONDS));
                Thread.sleep(10);  // again tries to consumer after 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}

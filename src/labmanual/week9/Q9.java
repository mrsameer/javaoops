/*
9. Write a Program using Threads to simulate a traffic light. The Signal lights should glow
after each 10 second, one by one. For example: Firstly Red, then after 10 seconds, red
will be put to off and yellow will start glowing and then accordingly green.
 */
package labmanual.week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q9 extends JFrame implements Runnable{
    JButton red, green, yellow;
    class Red implements Runnable{
        @Override
        public void run() {
            synchronized (this) {
                green.setBackground(Color.white);
                red.setBackground(Color.red);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }

    class Yellow implements Runnable {
        @Override
        public void run() {
            synchronized (this) {
                red.setBackground(Color.white);
                yellow.setBackground(Color.yellow);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }

    class Green implements Runnable {
        @Override
        public void run() {
            synchronized (this) {
                yellow.setBackground(Color.white);
                green.setBackground(Color.green);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }
    public Q9() {
        // set properties of this JFrame
        this.setVisible(true);
        this.setTitle("Traffic Lights");
        this.setBackground(Color.BLACK);
        this.setSize(600, 600);
        this.setLayout(new GridLayout(3, 1));  // grid layout with 3 rows and a column

        // add window listener to this JFrame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create Button objects
        red = new JButton();
        green = new JButton();
        yellow = new JButton();

        // add buttons to the frame
        this.add(red); this.add(yellow); this.add(green);

        // start this frame as a thread
        new Thread(this).start();
    }
    @Override
    public void run() {
        while (true) {
            Thread redThread = new Thread(new Red());
            redThread.start();
            synchronized (redThread) {
                try {
                    redThread.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Thread yellowThread = new Thread(new Yellow());
            yellowThread.start();
            synchronized (yellowThread) {
                try {
                    yellowThread.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Thread greenThread = new Thread(new Green());
            greenThread.start();
            synchronized (greenThread) {
                try {
                    greenThread.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
        }
    }

    public static void main(String[] args) {
        new Q9(); 
    }
}

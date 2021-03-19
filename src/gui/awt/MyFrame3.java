/*
Demonstration of window event by implementing WindowListener
 */
package gui.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame3 extends Frame implements WindowListener {

    // constructor
    public MyFrame3() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setBackground(Color.green);
        this.setTitle("Window events example");
        addWindowListener(this);  // adding window listener which handles window event
    }
    // implementing WindowListener interface
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        System.exit(0);  // terminating a program
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}


class MyFrame3Demo {
    public static void main(String[] args) {
        MyFrame3 f = new MyFrame3();
    }
}

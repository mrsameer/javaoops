/*
Implementing MouseListener to handle
 */
package gui.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame6 extends Frame {
    public MyFrame6() {
        this.setVisible(true);
        this.setTitle("Mouse Listener example");
        this.setBackground(Color.green);
        this.setSize(500, 500);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked [" + e.getX() + ", " + e.getY() + "]");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed [" + e.getX() + ", " + e.getY() + "]");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released [" + e.getX() + ", " + e.getY() + "]");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered [" + e.getX() + ", " + e.getY() + "]");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited [" + e.getX() + ", " + e.getY() + "]");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing window");
                System.exit(0);
            }
        });
    }
}

class MyFrame6Demo {
    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
    }
}
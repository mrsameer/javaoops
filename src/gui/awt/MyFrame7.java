/*
Handling keyboard events
 */
package gui.awt;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame7 extends Frame {
    public MyFrame7() {
        this.setVisible(true);
        this.setTitle("EXAMPLE OF KEYBOARD EVENT HANDLING");
        this.setBackground(Color.red);
        this.setSize(500, 500);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Typed key " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed key " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Released key " + e.getKeyChar());
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyFrame7Demo {
    public static void main(String[] args) {
        MyFrame7 f = new MyFrame7();
    }
}
/*
Button component example
 */
package gui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame2 extends JFrame {
    JButton b;
    public Frame2() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setTitle("Button exmple");

        // add windowlistener component
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create Component
        b = new JButton("Click me");

        // add button to the JFrame
        this.add(b);
    }
}

class Frame2Demo {
    public static void main(String[] args) {
        Frame2 f = new Frame2();
    }
}
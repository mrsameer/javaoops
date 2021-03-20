/*
 Added event listener example
 */
package gui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JFrame3 extends JFrame  implements ActionListener{
    JButton b;
    String label = "";
    public JFrame3() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Event listener example");
        this.setLayout(null);

        // add window listener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create Button component and set it's bounds as we using our own layout
        b = new JButton("Click me");
        b.setBounds(200, 200, 150, 30);

        // Create font object
        Font f = new Font("arial", Font.BOLD, 20);

        // set font to the JButton component
        b.setFont(f);

        // add button to the frame
        this.add(b);

        // add event listener to the button
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label = e.getActionCommand();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 30);
        g.setFont(f);
        g.drawString("Clicked button " + label, 150, 300);
    }
}

class JFrame3Demo {
    public static void main(String[] args) {
        JFrame3 f = new JFrame3();
    }
}
/*
Write a program to create a frame by creating an object to Jframe class and include close button
to terminate the application of the frame.
 */
package labmanual.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame implements ActionListener {
    JButton b;
    public MyFrame1() {

        // set properties of the JFrame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Button example");
        this.getContentPane().setBackground(Color.red);
        this.setLayout(null);

        // create button component
        b = new JButton("CLOSE");
        b.setBounds(100, 150, 300, 50);
        b.addActionListener(this);
        b.setFont(new Font("arial", Font.BOLD, 20));
        b.setBackground(Color.green);

        // add button to this JFrame
        this.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        if (label.equals("CLOSE"))
            System.exit(0);
    }
}

class MyFrame1Demo {
    public static void main(String[] args) {
        new MyFrame1();
    }
}
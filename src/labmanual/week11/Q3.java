/*
3. Write a program to create a push button , when the button is clicked an image is
displayed in the frame.
 */
package labmanual.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3 extends JFrame implements ActionListener {
    JButton jButton;
    ImageIcon imageIcon;
    JLabel label;
    public Q3() {
        // set properties of this frame
        this.setVisible(true);
        this.setTitle("Displays Image");
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Create Button component
        jButton = new JButton("push");

        // add action listener to this button
        jButton.addActionListener(this);

        // add button to this frame
        this.add(jButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        imageIcon = new ImageIcon("/home/sameer/Desktop/semester/javaoops/src/labmanual/week11/logo.jpeg");
        label = new JLabel(imageIcon);
        label.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        this.add(label);
        this.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
    }
}

class Q3Demo {
    public static void main(String[] args) {
        new Q3();
    }
}
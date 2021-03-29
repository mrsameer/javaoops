/*
2. Write program for the following.
    A. Display text in the frame by overriding PaintComponent() method of Jpanel class.
    B. Display some text in the frame with the help of a Label.
 */
package labmanual.week11;

import javax.swing.*;
import java.awt.*;

class A extends JPanel{
    public A() {
        // create new JFrame and set it's properties
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Display Text");
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add this JPanel to this frame
        frame.add(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.magenta);
        g.setFont(new Font("TimesRoman", Font.BOLD, 40));
        g.drawString("Hello World", 100, 225);
    }
}

class B extends JFrame {
    public B() {
        // set properties of this frame
        this.setVisible(true);
        this.setTitle("Displays text");
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // create a label
        JLabel jLabel = new JLabel();
        jLabel.setBounds(100, 225, 500, 50);

        // Write text to the label
        jLabel.setText("Hello World");

        // add label to the frame
        this.add(jLabel);
    }
}
public class Q2 {
    public static void main(String[] args) {
        new A();
        new B();
    }
}

/*
Defining user defined frame class
 */
package gui.awt;

import java.awt.*;

// MyFrame2 acts as Frame class as we are extending it with Frame class
public class MyFrame2 extends Frame {
    public MyFrame2() throws HeadlessException {
        this.setVisible(true);
        this.setSize(700, 300);
        this.setTitle("USER DEFINED FRAME");
        this.setBackground(Color.green);
    }

    @Override
    public void paint(Graphics g) {
        // first provide font characteristics
        Font font = new Font("arial", Font.ITALIC+Font.BOLD, 35);
        this.setForeground(Color.red);

        g.setFont(font);
        g.drawString("SHAIK SAMEER", 200, 100);  // displays message at (x,y)=(200, 100)

    }
}

class MyFrame2Demo {
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
}
/*
1. Write a program for the following a. display a frame with title MyFrame b. draw a
horizontal line. c. Draw one line perpendicular to other. One line parallel to other.
 */
package labmanual.week10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q1 extends Frame {
    public Q1() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("MyFrame");
        this.setBackground(Color.green);

        // add windowListener to the frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(0, 100, 500, 100);  // horizontal line

        // perpendicular lines
        g.drawLine(150, 200, 300, 200);
        g.drawLine(225, 150, 225, 250);

        // parallel lines
        g.drawLine(150, 300, 150, 400);
        g.drawLine(200, 300, 200, 400);
    }
}

class Q1Demo {
    public static void main(String[] args) {
        new Q1();
    }
}
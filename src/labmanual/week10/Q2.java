/*
2. Create an application to display a circle within rectangle and fill different colors in the
circle & rectangle
 */
package labmanual.week10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q2 extends Frame {
    public Q2() {
        this.setVisible(true);
        this.setSize(600, 600);
        this.setTitle("Circle within a Rectangle");

        // add window listener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // to fill rectangle
        g.setColor(Color.green);
        g.fillRect(50, 200, 500, 200);

        // to fill circle
        g.setColor(Color.red);
        g.fillOval(200, 200, 200, 200);
    }
}

class Q2Demo {
    public static void main(String[] args) {
        new Q2();
    }
}
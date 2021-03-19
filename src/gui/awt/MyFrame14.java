/*
Demonstration of scrollbar component
 */
package gui.awt;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame14  extends Frame implements AdjustmentListener {
    Scrollbar sb;
    int position;
    public MyFrame14() {
        // set properties of the frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setBackground(Color.green);
        this.setTitle("Scrollbar example");
        this.setLayout(new BorderLayout());

        // add windowlistener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create components
        sb = new Scrollbar(Scrollbar.VERTICAL);
        sb.addAdjustmentListener(this);
        this.add(BorderLayout.EAST, sb);
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 30);
        g.setFont(f);
        g.drawString("Position: " + position, 50, 300);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        position = sb.getValue();
        repaint();
    }
}

class MyFrame14Demo {
    public static void main(String[] args) {
        MyFrame14 f = new MyFrame14();
    }
}
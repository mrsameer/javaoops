/*
6. Create a GUI application to display a calculator using grid Layout (You do not
provide functionality).
 */
package labmanual.week10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q6 extends Frame {
    Button[] b = new Button[10];
    Button[] b2 = new Button[6];
    String[] op = new String[]{"+","-","*","%","=","C"};
    TextField t;
    public Q6() {
        // set properties of the frame
        this.setVisible(true);
        this.setTitle("Calcualtor");
        this.setBackground(Color.pink);
        this.setSize(600, 600);
        this.setLayout(new GridLayout(5, 4));

        // add windowListener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // add buttons to this frame
        for (int i = 0; i < 10; i++) {
            b[i] = new Button("" + i);
            this.add(b[i]);
            b[i].setBackground(Color.green);
        }

        for (int i = 0; i < 6; i++) {
            b2[i] = new Button(op[i]);
            this.add(b2[i]);
            b2[i].setBackground(Color.green);
        }

        // create textfield and add it to frame
        t = new TextField(20);
        this.add(t);
    }
}

class Q6Demo {
    public static void main(String[] args) {
        new Q6();
    }
}
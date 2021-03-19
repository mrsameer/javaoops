/*
Handling WindowEvent by using WindowAdapter anonymous class
 */
package gui.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame5 extends Frame {
    public MyFrame5() {
        this.setVisible(true);
        this.setTitle("WindowEvent example");
        this.setBackground(Color.green);
        this.setSize(500, 500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing window");
                System.exit(0);
            }
        });
    }
}

class MyFrame5Demo {
    public static void main(String[] args) {
        MyFrame5 f = new MyFrame5();
    }
}
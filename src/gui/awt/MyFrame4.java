/*
 Handling WindowEvent by extending WindowAdapter class
 */
package gui.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame4 extends Frame {
    public MyFrame4() {
        this.setVisible(true);
        this.setTitle("WINDOW EVENT HANDLING USING WINDOWADAPTER CLASS");
        this.setSize(500, 500);
        this.setBackground(Color.green);
        this.addWindowListener(new MyWindow());
    }
}

class MyWindow extends WindowAdapter {
    @Override
    // we need to provide implementation onlhy for window closing part if we extend WindowAdapter class
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        System.exit(0);  // termination of program
    }
}

class MyFrame4Demo {
    public static void main(String[] args) {
        MyFrame4 f = new MyFrame4();
    }
}
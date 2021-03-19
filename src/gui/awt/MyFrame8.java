/*
Demonstration of button labels and actions raised by then amd handled bu the event handlers
 */
package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame8 extends Frame implements ActionListener {
    Button b1, b2, b3;
    public MyFrame8() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Button example");
        this.setLayout(new FlowLayout());


        b1 = new Button("RED");
        b2 = new Button("GREEN");
        b3 = new Button("BLUE");

        // set background color for button
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);

        // add action listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Add buttons to the frame
        this.add(b1);
        this.add(b2);
        this.add(b3);

        // add windowListener to close this frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();  // get clicked button label
        if (label.equals("RED"))
            this.setBackground(Color.red);
        else if (label.equals("GREEN"))
            this.setBackground(Color.green);
        else if (label.equals("BLUE"))
            this.setBackground(Color.blue);
    }
}

class MyFrame8Demo {
    public static void main(String[] args) {
        MyFrame8 f = new MyFrame8();
    }
}
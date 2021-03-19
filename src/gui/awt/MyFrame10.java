/*
Example on TextField, TextArea, Button without Lambda expression
 */
package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame10 extends Frame implements ActionListener {

    Label l1, l2, l3, l4;
    TextField tf1, tf2, tf3;
    TextArea ta;
    Button b;

    String sid="", sname="", squal="", saddr="";

    public MyFrame10() {
        // set frame properties
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Registration frame");
        this.setBackground(Color.green);
        this.setLayout(new FlowLayout());

        // add window listener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);  // terminates program
            }
        });

        // prepare gui components
        l1 = new Label("Student ID");
        l2 = new Label("Student Name");
        l3 = new Label("Student Qualification");
        l4 = new Label("Student Address");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        ta  = new TextArea(5, 20);
        b = new Button("Register");

        // add action listener to the button
        b.addActionListener(this);

        // create font object
        Font f = new Font("arial", Font.BOLD, 15);

        // set font to the gui components
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        ta.setFont(f);
        b.setFont(f);

        // add all the gui components to the frame in flow fashion
        this.add(l1); this.add(tf1);
        this.add(l2); this.add(tf2);
        this.add(l3); this.add(tf3);
        this.add(l4); this.add(ta);
        this.add(b);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        sid = tf1.getText();
        sname = tf2.getText();
        squal = tf3.getText();
        saddr = ta.getText();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        // create Font object
        Font f = new Font("arial", Font.BOLD, 35);
        this.setFont(f);
        this.setForeground(Color.red);

        g.drawString("Student ID: " + sid, 50, 300);
        g.drawString(" Student Name: " + sname, 50, 350);
        g.drawString(" Student Qualification: " + squal ,  50, 400);
        g.drawString(" Student Address: " + saddr , 50, 450);
    }
}

class MyFrame10Demo {
    public static void main(String[] args) {
        MyFrame10 f = new MyFrame10();
    }
}
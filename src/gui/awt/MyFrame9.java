/*
Demonstration of text filed which is an input GUI component
 */
package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame9 extends Frame implements ActionListener {
    Label l1, l2;
    TextField tf1, tf2;
    Button b;
    String status = "";
    public MyFrame9() {
        // set frame properties
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.green);

        // add windowListener to the frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l1 = new Label("user name");
        l2 = new Label("password");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf2.setEchoChar('*');
        b = new Button("Login");
        b.addActionListener(this);

        Font f = new Font("arial", Font.BOLD, 25);
        l1.setFont(f);
        l2.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        b.setFont(f);

        // add components to the frame
        this.add(l1); this.add(tf1);
        this.add(l2); this.add(tf2);
        this.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String uname = tf1.getText();
        String pwd = tf2.getText();
        if (uname.equals("sameer") && pwd.equals("sameer"))
            status = "SUCCESS";
        else
            status = "FAILED";
        repaint(); // paint method gets called internally and new data gets displayed
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 35);
        g.setFont(f);
        this.setForeground(Color.red);
        g.drawString("Login status: " + status, 50, 300);
    }
}

class MyFrame9Demo {
    public static void main(String[] args) {
        MyFrame9 f = new MyFrame9();
    }
}
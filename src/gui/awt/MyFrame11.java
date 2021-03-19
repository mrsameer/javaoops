/*
 Checkbox GUI component example
 */
package gui.awt;

import java.awt.*;
import java.awt.event.*;

public class MyFrame11 extends Frame implements ItemListener {
    Label l1, l2;
    Checkbox cb1, cb2, cb3, cb4, cb5;

    String uqual="";
    String gender="";

    public MyFrame11() {
        // set properties of the frame
        this.setVisible(true);
        this.setTitle("Checkbox example");
        this.setSize(500, 500);
        this.setBackground(Color.green);
        this.setLayout(new FlowLayout());

        // add window Listener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create components
        l1 = new Label("Qualification");
        l2 = new Label("Gender");
        cb1 = new Checkbox("BSC", null, false);
        cb2 = new Checkbox("MCA", null, false);
        cb3 = new Checkbox("B.TECH", null, false);

        CheckboxGroup cg = new CheckboxGroup();
        cb4 = new Checkbox("MALE", cg, false);
        cb5 = new Checkbox("FEMALE", cg, false);

        // add itemlistener to the checkboxes
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);

        // create font object
        Font f = new Font("arial", Font.BOLD, 20);

        // sent font to the components
        l1.setFont(f);
        l2.setFont(f);
        cb1.setFont(f);
        cb2.setFont(f);
        cb3.setFont(f);
        cb4.setFont(f);
        cb5.setFont(f);

        // add components to the frame
        this.add(l1);
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.add(l2);
        this.add(cb4);
        this.add(cb5);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (cb1.getState() == true)
            uqual +=  cb1.getLabel() + ",";
        if (cb2.getState() == true)
            uqual += cb2.getLabel() + ",";
        if (cb3.getState() == true)
            uqual += cb3.getLabel() + ",";
        if (cb4.getState() == true)
            gender = cb4.getLabel();
        if (cb5.getState() == true)
            gender = cb5.getLabel();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 20);
        g.setFont(f);
        this.setForeground(Color.red);
        g.drawString("Qualifications: " + uqual , 50, 300);
        g.drawString("Gender: " + gender, 50, 350);
        uqual=""; // free uqual variable after painting
    }
}

class MyFrame11Demo {
    public static void main(String[] args) {
        MyFrame11 f = new MyFrame11();
    }
}
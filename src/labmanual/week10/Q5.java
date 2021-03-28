/*
5. Create a GUI with title STUDENT which has labels roll no., name, course, gender, class,
address with textboxes for taking input from the user(without any functionality) and
checkboxes for selecting the course, radio buttons for selecting gender with appropriate
background color.
 */
package labmanual.week10;

import java.awt.*;
import java.awt.event.*;

public class Q5 extends Frame implements ItemListener, ActionListener {
    String name="", roll="", course="", gen="", clss="", addr="";
    Label sName, sRollno, sCourse, sGender, sClass, sAddress;
    TextField tf1, tf2, tf3;
    Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    CheckboxGroup cg;
    TextArea ta;
    public Q5() {
        // set properties of this frame
        this.setVisible(true);
        this.setSize(600, 600);
        this.setTitle("STUDENT");
        this.setBackground(Color.blue);
        this.setLayout(new FlowLayout());

        // add windowlistener to this frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create labels
        sName = new Label("Student Name");
        sRollno = new Label("Student Roll no");
        sCourse = new Label("Student Course");
        sGender = new Label("Student Gender");
        sClass = new Label("Student Class");
        sAddress = new Label("Student Address");

        // create textfields for sName, sRollno, sClass
        tf1 = new TextField(20);
        tf2 = new TextField(10);
        tf3 = new TextField(10);

        // create checkbox for selecting the sCourse
        cb1 = new Checkbox("OOPS", null, false);
        cb2 = new Checkbox("OS", null, false);
        cb3 = new Checkbox("FLAT", null, false);
        cb4 = new Checkbox("C", null, false);
        cb5 = new Checkbox("AI", null, false);

        // create checkboxgroup and add it to checkboxes for selecting the gender
        cg = new CheckboxGroup();
        cb6 = new Checkbox("MALE", cg, false);
        cb7 = new Checkbox("FEMALE", cg, false);

        // create textarea component for sAddress
        ta = new TextArea(3, 20);

        // create font object
        Font f = new Font("arial", Font.BOLD, 20);

        // sent font to the components
         sName.setFont(f);
         sRollno.setFont(f);
         sClass.setFont(f);
         sAddress.setFont(f);
         sCourse.setFont(f);
         sGender.setFont(f);
         tf1.setFont(f);
         tf2.setFont(f);
         tf3.setFont(f);
         ta.setFont(f);
         cb1.setFont(f);
         cb2.setFont(f);
         cb3.setFont(f);
         cb4.setFont(f);
         cb5.setFont(f);
         cb6.setFont(f);
         cb7.setFont(f);

         // add event listeners to the components
         cb1.addItemListener(this);
         cb2.addItemListener(this);
         cb3.addItemListener(this);
         cb4.addItemListener(this);
         cb5.addItemListener(this);
         cb6.addItemListener(this);
         cb7.addItemListener(this);
         tf1.addActionListener(this);
         tf2.addActionListener(this);
         tf3.addActionListener(this);
         ta.addTextListener(new TextListener() {
             @Override
             public void textValueChanged(TextEvent e) {
                 addr = ta.getText();
                 repaint();
             }
         });

         // add components to this frame
        this.add(sName); this.add(tf1);
        this.add(sRollno); this.add(tf2);
        this.add(sClass); this.add(tf3);
        this.add(sCourse);
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.add(cb4);
        this.add(cb5);
        this.add(sGender);
        this.add(cb6);
        this.add(cb7);
        this.add(sAddress); this.add(ta);
    }


    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 20);
        g.setFont(f);
        this.setForeground(Color.red);
        g.drawString("Student Name: " + name, 50, 300);
        g.drawString("Student gender: " + gen, 50, 350);
        g.drawString("Student roll no: " + roll, 50, 400);
        g.drawString("Student Class: " + clss, 50, 450);
        g.drawString("Student Courses: " + course, 50, 500);
        g.drawString("Student Address: " + addr, 50, 550);

        course = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name = tf1.getText();
        roll = tf2.getText();
        clss = tf3.getText();
        repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (cb1.getState() == true)
            course += cb1.getLabel() + ", ";
        if (cb2.getState() == true)
            course += cb2.getLabel() + ", ";
        if (cb3.getState() == true)
            course += cb3.getLabel() + ", ";
        if (cb4.getState() == true)
            course += cb4.getLabel() + ", ";
        if (cb5.getState() == true)
            course += cb5.getLabel() + ", ";
        if (cb6.getState()  == true)
            gen = cb6.getLabel();
        if (cb7.getState() == true)
            gen = cb7.getLabel();
        repaint();
    }
}

class Q5Demo {
    public static void main(String[] args) {
        new Q5();
    }
}
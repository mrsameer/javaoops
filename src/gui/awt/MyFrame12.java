package gui.awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame12 extends Frame implements ItemListener {
    Label l1, l2;
    List l;
    Choice ch;
    String usrTech = "";
    String usrProf = "";
    public MyFrame12() {
        //set properties of the frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setBackground(Color.green);
        this.setTitle("List choice example");
        this.setLayout(new FlowLayout());

        // add windowListener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);  // terminates the program
            }
        });

        // create components
        l1 = new Label("Technologies");
        l2 = new Label("Profession");
        l = new List(4, true);
        l.add("C");
        l.add("C++");
        l.add("Java");
        l.add("Oracle");
        l.add(".NET");
        l.add("Hadoop");
        l.addItemListener(this);
        ch = new Choice();
        ch.add("Student");
        ch.add("Teacher");
        ch.add("Software Engineer");
        ch.addItemListener(this);

        //create font object
        Font f = new Font("arial", Font.BOLD, 20);

        // set font properties to the components
        l1.setFont(f);
        l2.setFont(f);
        l.setFont(f);
        ch.setFont(f);

        // add components to the frame
        this.add(l1); this.add(l);
        this.add(l2); this.add(ch);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String[] items = l.getSelectedItems();
        for (String str:
             items) {
            usrTech += str + ", ";
        }
        usrProf = ch.getSelectedItem();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 20);
        this.setForeground(Color.red);
        g.setFont(f);
        g.drawString("User Tech: " + usrTech, 50, 300);
        g.drawString("User Profesion: " + usrProf, 50, 350);
        usrTech = "";
    }
}

class MyFrame12Demo {
    public static void main(String[] args) {
        MyFrame12 f = new MyFrame12();
    }
}
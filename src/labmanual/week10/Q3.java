/*
3. Write an application that displays any string. Choose color from combo box to change
the color of this displayed string and choose its size & type respectively from another two
combo boxes.
 */
package labmanual.week10;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q3 extends Frame {
    Choice choice, choice2, choice3;
    Color color = Color.black;  // default color of the String in paint
    int type = Font.BOLD;   // default font type set to bold
    int size = 50;   // default font size set to 50
    String label, label2, label3;
    public Q3() {
        // set properties of the frame
        this.setVisible(true);
        this.setTitle("String color changer");
        this.setSize(600, 600);
        this.setLayout(null);

        // add window listener to this frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create choice objects and add items to them
        choice = new Choice();
        choice2 = new Choice();
        choice3 = new Choice();
        choice.setBounds(0, 200, 150, 50);
        choice2.setBounds(170, 200, 140, 50);
        choice3.setBounds(320, 200, 100, 50);
        choice.setFont(new Font("arial", Font.BOLD + Font.ITALIC, 30));
        choice2.setFont(new Font("arial", Font.BOLD + Font.ITALIC, 30));
        choice3.setFont(new Font("arial", Font.BOLD + Font.ITALIC, 30));
        choice.add("red"); choice.add("green"); choice.add("blue"); choice.add("magenta");
        choice2.add("bold"); choice2.add("italic"); choice2.add("plain"); choice2.add("roman");
        choice3.add("10"); choice3.add("30"); choice3.add("50"); choice3.add("100");
        // add item listeners to the choice objects
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label = e.getItem().toString();
                if (label.equals("red"))
                    color = Color.red;
                else if (label.equals("green"))
                    color = Color.green;
                else if (label.equals("blue"))
                    color = Color.blue;
                else if (label.equals("magenta"))
                    color = Color.magenta;
                repaint();
            }
        });

        choice2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label2 = e.getItem().toString();
                if (label2.equals("bold"))
                    type = Font.BOLD;
                else if (label2.equals("italic"))
                    type = Font.ITALIC;
                else if (label2.equals("plain"))
                    type = Font.PLAIN;
                else if (label2.equals("roman"))
                    type = Font.ROMAN_BASELINE;
                repaint();
            }
        });

        choice3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label3 = e.getItem().toString();
                if (label3.equals("10"))
                    size = 10;
                else if (label3.equals("30"))
                    size = 30;
                else if (label3.equals("50"))
                    size = 50;
                else if (label3.equals("100"))
                    size = 100;
                repaint();
            }
        });

        // add choice objects to this frame
        this.add(choice);
        this.add(choice2);
        this.add(choice3);

    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("arial", type, size));
        g.setColor(color);
        g.drawString("Hi", 250, 500);
    }
}

class Q3Demo {
    public static void main(String[] args) {
        new Q3();
    }
}
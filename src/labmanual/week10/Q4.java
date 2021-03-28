/*
4. Write a small application with a default date 01/01/2000 and three combo boxes
displaying valid days, months & year (1990 – 2050). Change the displayed date with the
one chosen by user from these combo boxes.
 */
package labmanual.week10;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q4 extends Frame {
    Choice choice, choice2, choice3;
    String day = "1", month = "1", year = "2000";
    public Q4() {
        // set properties of the frame
        this.setVisible(true);
        this.setTitle("Date selector");
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
        // add day choices
        for (int i = 1; i <= 31; i++)
            choice.add(String.valueOf(i));
        // add month choices
        for (int i = 1; i <= 12; i++)
            choice2.add(String.valueOf(i));

        // add year choices
        for (int i = 1990; i <= 2050; i++)
            choice3.add(String.valueOf(i));

        // add item listeners to the choice objects
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                day = e.getItem().toString();
                repaint();
            }
        });

        choice2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                month = e.getItem().toString();
                repaint();
            }
        });

        choice3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                year = e.getItem().toString();
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
        g.setFont(new Font("arial", Font.BOLD + Font.ITALIC, 50));
        g.setColor(Color.red);
        g.drawString(day + "-" + month + '-' + year, 150, 500);
    }
}

class Q4Demo {
    public static void main(String[] args) {
        new Q4();
    }
}
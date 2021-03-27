/*
3. Write an application that displays any string. Choose color from combo box to change
the color of this displayed string and choose its size & type respectively from another two
combo boxes.
 */
package labmanual.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q3 extends Frame implements ItemListener {
    JComboBox jComboBox;
    Color color = Color.BLACK; // default color
    String[] colors;
    String label;
    public Q3() {
        // set properties for this frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Play with String color");
        this.setLayout(null);

        // add windowListener to this frame
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create list of colors
        colors = new String[]{"red", "blue", "green", "black", "pink", "magenta"};

        // create JComboBox object
        jComboBox = new JComboBox(colors);
        jComboBox.setBounds(215, 300, 100, 20);
        // add JComboBox to this frame
        this.add(jComboBox);

        // add Itemlistener to this jcombobox
        jComboBox.addItemListener(this);


    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("arial", Font.BOLD, 50));
        g.setColor(color);
        g.drawString("Hi", 215, 265);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        label = e.getItem().toString();
        if (label.equals("red"))
            color = Color.red;
        else if (label.equals("blue"))
            color = Color.blue;
        else if (label.equals("green"))
            color = Color.green;
        else if (label.equals("black"))
            color = Color.black;
        else if (label.equals("pink"))
            color = Color.pink;
        else if (label.equals("magenta"))
            color = Color.magenta;
        repaint();
    }
}

class Q3Demo {
    public static void main(String[] args) {
        new Q3();
    }
}
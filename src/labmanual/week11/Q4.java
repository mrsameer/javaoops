/*
4. Write a program to create a menu with several menu items.
 */
package labmanual.week11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q4 extends Frame implements ActionListener {
    String item="";
    public Q4() {
        // set properties of the frame
        this.setVisible(true);
        this.setBackground(Color.green);
        this.setSize(500, 500);
        this.setTitle("Menu Example");

        // add window listener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create menubar component
        MenuBar mb = new MenuBar();

        // add menubar to this frame
        this.setMenuBar(mb);

        // create menu component
        Menu m  = new Menu("File");
        mb.add(m);

        // create menuitems and add to Menu
        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("Open");
        MenuItem mi3 = new MenuItem("Save");
        MenuItem mi4 = new MenuItem("Save As");

        // add action listener to the menuitems
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        // add menuitems to menu
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        m.add(mi4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        item = e.getActionCommand();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial", Font.BOLD, 30);
        g.setFont(f);
        g.drawString("Selected item: " + item, 50, 300);
    }
}

class Q4Demo {
    public static void main(String[] args) {
        new Q4();
    }
}
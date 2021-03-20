/*
Creation of JFrame
 */
package gui.swing;

import javax.swing.*;

public class Frame1 extends JFrame{
    public Frame1() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("My First Frame");
    }
}

class Frame1Demo {
    public static void main(String[] args) {
        Frame1 f = new Frame1();
    }
}
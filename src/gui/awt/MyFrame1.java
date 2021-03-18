/*
Defining frame in main method.
 */
package gui.awt;

import java.awt.*;

public class MyFrame1 {
    public static void main(String[] args) {
         Frame frame = new Frame();  // frame gets created internally but it is not in visible mode

//        // we can also call constructor with frame name as argument
//        Frame frame = new Frame("sample frame");

        // by default width and height of frame is 0, 0.
        // so set the width and height of the frame
        frame.setSize(500, 500);

        // make the frame to visible
        frame.setVisible(true);

        // explicity set title of the frame
        frame.setTitle("Sample Frame");

        // set background color
        frame.setBackground(Color.green);
    }
}

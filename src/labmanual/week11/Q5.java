/*
5. Create an application Form for University Enrollment with the following Fields.
a. Check box b. Text area c. List box d. Display text
box. g. Radio buttons. h. Back ground color
e. Push buttons
f. Combo
 */
package labmanual.week11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q5 extends Frame {
    Label nameLabel, courseLabel, addressLabel, genderLabel, branchLabel, collegeBranchLabel;
    TextField tf1;
    TextArea ta;
    Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    CheckboxGroup cg;
    Button b1;
    Choice ch1;
    List l1;
    public Q5() {
        // set properties to the frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setBackground(Color.yellow);
        this.setLayout(new FlowLayout());
        this.setTitle("University enrollment");

        // add window listener to this
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create components
        nameLabel = new Label("Name");
        courseLabel = new Label("Course");
        addressLabel = new Label("Address");
        genderLabel = new Label("Gender");
        branchLabel = new Label("Branch");
        collegeBranchLabel = new Label("College Branch");

        tf1 = new TextField(20);
        ta = new TextArea(4, 20);

        cb1 = new Checkbox("MEFA", null, false);
        cb2 = new Checkbox("EITK", null, false);
        cb3 = new Checkbox("Programming", null, false);
        cb4 = new Checkbox("Drawing", null, false);
        cb5 = new Checkbox("swimming", null, false);

        cg = new CheckboxGroup();
        cb6 = new Checkbox("MALE", cg, false);
        cb7 = new Checkbox("FEMALE", cg, false);

        b1 = new Button("PUSH");

        ch1 = new Choice();
        ch1.add("CSE");
        ch1.add("ECE");
        ch1.add("MME");
        ch1.add("ME");
        ch1.add("CE");

        l1 = new List(5);
        l1.add("HYDERABAD");
        l1.add("BOMBAY");
        l1.add("SEATTLE");
        l1.add("CINCINNATI");
        l1.add("COLUMBUS");
        l1.add("MIAMI");
        l1.add("AUSTIN");
        l1.add("TAMPA");

        // create Font object
        Font f = new Font("arial", Font.BOLD + Font.ITALIC, 20);
        Font f2 = new Font("Consoles", Font.ROMAN_BASELINE, 40);

        // set font to the components
        nameLabel.setFont(f2);
        courseLabel.setFont(f2);
        addressLabel.setFont(f2);
        genderLabel.setFont(f2);
        branchLabel.setFont(f2);
        collegeBranchLabel.setFont(f2);
        tf1.setFont(f);
        ta.setFont(f);
        cb1.setFont(f);
        cb2.setFont(f);
        cb3.setFont(f);
        cb4.setFont(f);
        cb5.setFont(f);
        cb6.setFont(f);
        cb7.setFont(f);
        b1.setFont(f);
        b1.setBackground(Color.red);
        ch1.setFont(f);
        l1.setFont(f);

        // add components to the frame
        this.add(nameLabel); this.add(tf1);
        this.add(courseLabel);
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.add(cb4);
        this.add(cb5);
        this.add(genderLabel);
        this.add(cb6);
        this.add(cb7);
        this.add(branchLabel);
        this.add(ch1);
        this.add(collegeBranchLabel);
        this.add(l1);
        this.add(addressLabel); this.add(ta);
        this.add(b1);

    }
}

class Q5Demo {
    public static void main(String[] args) {
        new Q5();
    }
}
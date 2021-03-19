package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;

public class MyFrame15 extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5;
    TextField tf1, tf2, tf3, tf4;
    Button b;
    String status = "";

    public MyFrame15() {
        // set properties of the frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("AWT-JDBC INTEGRATION");
        this.setBackground(Color.green);
        this.setLayout(new FlowLayout());

        // add window listener
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create components
        l1 = new Label("Employee id");
        l2 = new Label("Employee name"); 
        l3 = new Label("Employee salary"); 
        l4 = new Label("Employee address"); 
        
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        tf4 = new TextField(20);

        b = new Button("ADD");
        b.addActionListener(this);

        // create font object
        Font f = new Font("consolas", Font.BOLD, 25);

        // set font to the components
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        tf4.setFont(f);
        b.setFont(f);

        // add components to the frame
        this.add(l1); this.add(tf1);
        this.add(l2); this.add(tf2);
        this.add(l3); this.add(tf3);
        this.add(l4); this.add(tf4);
        this.add(b);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int eno = Integer.parseInt(tf1.getText());
            String ename = tf2.getText();
            Float esal = Float.parseFloat(tf3.getText());
            String eaddr = tf4.getText();

            Empservice empservice = new Empservice();
            status = empservice.add(eno, ename, esal, eaddr);
            repaint();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("consolas", Font.BOLD, 25);
        g.setFont(f);
        g.drawString("Status: " + status, 100, 400);
    }
}

class Empservice {
    private String status = "";
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    public Empservice() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");
             st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public String add(int eno, String ename, Float esal, String addr) {
        try {
            rs = st.executeQuery("select * from employees where eno=" + eno);
            Boolean b = rs.next();
            if (b == true)
                status = "Employee exists already";
            else {
                int rowCount = st.executeUpdate("insert into employees(eno, ename, esal, eadd) values(" + eno + ",'" + ename + "'," + esal + ",'" + addr + "'" +")");
                if (rowCount == 1)
                    status = "Inserted into employees table successfully";
                else
                    status = "Insertion into employees table failed";
            }
        } catch (SQLException throwables) {
            status = "Insertion into employees table failed";
            throwables.printStackTrace();
        }
        return this.status;
   }
}

class MyFrame15Demo {
    public static void main(String[] args) {
        MyFrame15 f = new MyFrame15();
    }
}
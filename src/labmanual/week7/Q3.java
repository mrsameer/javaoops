/*
3. Create an interface payable with method getAmount(). Calculate the amount to be paid to Invoice and Employee
by implementing Interface
 */
package labmanual.week7;

interface Payable {
    Double getAmount();
}

class Emp implements Payable {
    String fname;
    String lname;
    double sal;

    void setData(String fname, String lname, double sal) {
        this.fname = fname;
        this.lname = lname;
        this.sal = sal;

    }

    public Double getAmount() {
        return sal;

    }

    void show() {
        System.out.println("Name: " + fname + " " + lname);


    }


}

public class Q3 {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.setData("sameer", "shaik", 123214.432);
        double sal = e.getAmount();
        e.show();
        System.out.println("Salary : " + sal);
    }
}



/*
6.Create an Interface getAmount(),getFirstName(),getLastName(), amount paid by the Hostler and NonHostler
Fee of StudentFee with method getAddress(), getContact(). Calculate the student by implementing interface Student
 */
package labmanual.week7;

interface StudentFee
{
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();


}
class Hostler implements StudentFee
{
    String fname;
    String lname;
    String address;
    String contact;
    double amount;
    void setData(String fname,String lname,String address,String contact,double amount)
    {
        this.fname=fname;
        this.lname=lname;
        this.address=address;
        this.contact=contact;
        this.amount=amount;


    }
    public double getAmount()
    {
        return amount;
    }
    public String getFirstName()
    {
        return fname;

    }
    public String getLastName()
    {
        return lname;
    }
    public String getAddress()
    {
        return address;
    }
    public String getContact()
    {
        return contact;
    }
}
class NonHostler implements StudentFee
{
    String fname;
    String lname;
    String address;
    String contact;
    double amount;
    void setData(String fname,String lname,String address,String contact,double amount)
    {
        this.fname=fname;
        this.lname=lname;
        this.address=address;
        this.contact=contact;
        this.amount=amount;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getFirstName()
    {
        return fname;

    }
    public String getLastName()
    {
        return lname;
    }
    public String getAddress()
    {
        return address;
    }
    public String getContact()
    {
        return contact;
    }
}
public class Q6 {
    public static void main(String args[])
    {
        Hostler h=new Hostler();
        h.setData("sameer","shaik" ,"new york","123445",(10000+50000));
        double amount=h.getAmount();
        String fnm=h.getFirstName();
        String lnm=h.getLastName();
        String address=h.getAddress();
        String contact=h.getContact();
        System.out.println("\nFirst Name : "+fnm+"\nLast Name : "+lnm+"\nAddress: "+address+"\nContact : "+contact+"\n Amount :"+amount);
        NonHostler nh=new NonHostler();
        nh.setData("dsfsdf","Dd","afsdf","12132",(50000));
        amount=nh.getAmount();
        fnm=nh.getFirstName();
        lnm=nh.getLastName();
        address=nh.getAddress();
        contact=nh.getContact();
        System.out.println("\nFirst Name : "+fnm+"\nLast Name : "+lnm+"\nAddress: "+address+"\nContact : "+contact+"\n Amount :"+amount);
    }
}

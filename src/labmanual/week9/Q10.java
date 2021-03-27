/*
10. Write a Program using Threads for the following case study: Movie Theater To watch
a movie the following process is to be followed, at first get the ticket then show
the
ticket. Assume that N persons are trying to enter the Theater hall all at once, display
their sequence of entry into theater. Note: The person should enter only after getting a
ticket and showing it to the boy.
 */
package labmanual.week9;
class Customer extends Thread{
    String cname;
    Theater theater;

    public Customer(String cname, Theater theater) {
        this.cname = cname;
        this.theater = theater;
    }

    @Override
    public void run() {
        theater.getTicket(this);
        theater.enterInside(this);
    }
}

class Theater {
    public  synchronized void getTicket(Customer cust) {
        System.out.println(cust.cname + " bought ticket");
    }
    public  synchronized void enterInside(Customer cust) {
        System.out.println(cust.cname + " entered inside Theater");
    }
}
public class Q10 {
    public static void main(String[] args) {
        Theater theater = new Theater();
        new Thread(new Customer("Eoin", theater)).start();
        new Thread(new Customer("Stokes", theater)).start();
        new Thread(new Customer("Buttler", theater)).start();
        new Thread(new Customer("Johnny", theater)).start();
        new Thread(new Customer("Livingstone", theater)).start();
        new Thread(new Customer("Roy", theater)).start();
        new Thread(new Customer("sam", theater)).start();
        new Thread(new Customer("Tom", theater)).start();
        new Thread(new Customer("Adil", theater)).start();
        new Thread(new Customer("Jofra", theater)).start();
        new Thread(new Customer("Moeen", theater)).start();
    }
}

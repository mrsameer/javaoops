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
        Theater threater = new Theater();
        new Thread(new Customer("Eoin", threater)).start();
        new Thread(new Customer("Stokes", threater)).start();
        new Thread(new Customer("Buttler", threater)).start();
        new Thread(new Customer("Johnny", threater)).start();
        new Thread(new Customer("Livingstone", threater)).start();
        new Thread(new Customer("Roy", threater)).start();
        new Thread(new Customer("sam", threater)).start();
        new Thread(new Customer("Tom", threater)).start();
        new Thread(new Customer("Adil", threater)).start();
        new Thread(new Customer("Jofra", threater)).start();
        new Thread(new Customer("Moeen", threater)).start();
    }
}

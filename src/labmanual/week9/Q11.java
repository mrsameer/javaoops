/*
11. Write a Program using Threads for the following case study: Train Reservation system
To reserve a berth the following process need to be followed, at first check the number of
available berths with the requested berths, if the number of requested berths are less than
or equal to available berths then allot berth and print ticket or else display no berths are
available. Assume that N persons are trying to reserve the berth, display their sequence of
reservation status along with the number of available berths. Note : The person can print
ticket only if berth is confirmed.
 */
package labmanual.week9;

class Cust extends Thread{
    String cname;
    TrainTicket trainTicket;
    int numberofTickets;

    public Cust(String cname, int numberofTickets, TrainTicket trainTicket) {
        this.cname = cname;
        this.numberofTickets = numberofTickets;
        this.trainTicket = trainTicket;
    }

    @Override
    public void run() {
        trainTicket.reserve(this);
    }
}
class TrainTicket {
    int berths;

    public TrainTicket(int berths) {
        this.berths = berths;
    }

    public synchronized void reserve(Cust cust) {
        if (cust.numberofTickets <= berths) {
            System.out.println(cust.cname + " booked " + cust.numberofTickets + " tickets");
            berths -= cust.numberofTickets;
            System.out.println("Currently " + berths + " tickets available");
        }
        else
            System.out.println("sorry " + cust.cname + " no berths available");
    }
}

public class Q11 {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket(20); // initially 20 berths
        new Cust("tom", 4, trainTicket).start();
        new Cust("pam", 1, trainTicket).start();
        new Cust("nick", 15, trainTicket).start();
        new Cust("mave", 1, trainTicket).start();
    }
}

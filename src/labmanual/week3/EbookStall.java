/*
5. Implement the case study using OOP concepts in java. Ebook stall: Every book has properties which includes : Book_Name,
Book_Author, Book_count.
Every Customer is having properties as: Customer_Id, Customer_Name, Customer_Address and he can buy Books from E-Book stall.
Write a program which will display the book name and the remaining count of text books when a customer buys a new book.
 */
package labmanual.week3;

import java.util.ArrayList;
import java.util.HashMap;

public class EbookStall {
    private ArrayList<Book> books;
    private ArrayList<Customer> customers = new ArrayList<>();
    private HashMap<Customer, Book> customerBookHashMap = new HashMap<>();

    public EbookStall(ArrayList<Book> books) {
        this.books = books;
    }

    public void addCustomer(Customer customer, String book) {
        boolean flag = false;
           for (Book b:
                   books) {
               if (b.getBookName().equals(book) && b.getBookCount() > 0) {
                   b.setBookCount(b.getBookCount() - 1);  // reduce the quantity of the book
                   customerBookHashMap.put(customer, b);  // add book and customer to customerBookHashMap
                   System.out.println("Customer " + customer.getcName() + " bought " + b.getBookName());
                   flag = true;
               }
           }
        if (!flag)
            System.out.println("Sorry book is not available");
    }
}

class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;

    public Book(String bookName, String bookAuthor, int bookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}

class Customer {
    private int cID;
    private String cName;
    private String cAddress;

    public Customer(int cID, String cName, String cAddress) {
        this.cID = cID;
        this.cName = cName;
        this.cAddress = cAddress;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }
}

class EbookStallDemo {
    public static void main(String[] args) {
        // Create ArrayList of Book Wrapper class
        ArrayList<Book> bookArrayList = new ArrayList<>();

        // create three books and add it to the bookArrayList
        Book b1 = new Book("Java book", "Sameer", 10);
        Book b2 = new Book("C++ book", "Rams", 20);
        Book b3 = new Book("Python book", "Dave", 1);

        // add Book objects to the bookArrayList
        bookArrayList.add(b1);
        bookArrayList.add(b2);
        bookArrayList.add(b3);

        // create EbookStall object
        EbookStall ebookStall = new EbookStall(bookArrayList);

        // Create customer object
        Customer customer1 = new Customer(1, "bob", "new york");
        Customer customer2 = new Customer(2, "swam", "miami");

        //customer1 buys Java book
        ebookStall.addCustomer(customer1, "Java book"); // Customer bob bought Java book
        ebookStall.addCustomer(customer2 , "Python book"); // Customer swam bought Python book
        ebookStall.addCustomer(customer1, "C book"); // Sorry book is not available
        ebookStall.addCustomer(customer1, "Python book");  // Sorry book is not available
    }
}
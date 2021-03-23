/*
5. Write Java program for the following
a. Example for this operator and the use of this keyword.
b. Example for super keyword.
c. Example for static variables and methods.
 */
package labmanual.week5;

// constructor in a class without this keyword
class Student1 {
    int rollno;
    String name;
    float fee;

    public Student1(int rollno, String name, float fee) {
        rollno = rollno;
        name = name;
        fee = fee;
    }

    public void display() {
        System.out.println("roll no: " + rollno + " name: " + name + " fee: " + fee);
    }
}

// constructor in a class with this keyword
class Student2 {
    int rollno;
    String name;
    float fee;

    public Student2(int rollno, String name, float fee) {
        /*
        In the above example, parameters (formal arguments) and instance variables are same. So, we are using
        this keyword to distinguish local variable and instance variable.
         */
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    public void display() {
        System.out.println("roll no: " + rollno + " name: " + name + " fee: " + fee);
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;

    public Emp(int id, String name, float salary) {
        super(id, name);  // reusing parent constructor
        this.salary = salary;
    }
    public void display() {
        System.out.println("Id: " + id + " name: " + name + " salary: " + salary);
    }
}

class StaticDemo {
    static int x = 19;  // static variable alongside initialization
    static int y;      // declaration of static variable

    // static method
    static void func(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    // static block
    static {
        System.out.println("Running static block");
        y = x + 100;
    }
}
public class Q5 {
    public static void main(String[] args) {
        // demonstration of this keyword
        new Student1(111, "ankit", 5000f).display();  // displays incorrect information as it fails to assign values
        new Student2(111, "ankit", 5000f).display();  // displays correct information

        //demonstration of super keyword
        new Emp(1, "ankit", 45000f).display();

        // demonstration of static variables and methods
        StaticDemo.func(100);
    }
}

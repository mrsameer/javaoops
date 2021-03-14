package constructors;

public class Student {

    // instance variables
    private String name;
    private int rollno;

    // the purpose of the constructor is to initialize the object
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        // the purpose of new keyword is to create new object.
        Student s1 = new Student("sameer", 34);
        Student s2 = new Student("kevin", 35);

        // prints s1's name and rollno
        System.out.println("Student one name is: " + s1.name + " and roll number is: " + s1.rollno);

        // prints s2's name and rollno
        System.out.println("Student two name is: " + s2.name + " and roll number is: " + s2.rollno);
    }
}

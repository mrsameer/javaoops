/*
Write a program to display details of the required employee based on his Id. The details of
employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
Emp_salary,
Emp_Address etc.,
 */
package labmanual.week3;

public class Employee {
    private int Emp_id;
    private String Emp_name;
    private int Emp_age;
    private char Emp_gender;

    public int getEmp_id() {
        return Emp_id;
    }

    private String Emp_designation;
    private double Emp_salary;
    private String Emp_address;

    public Employee(int emp_id, String emp_name, int emp_age, char emp_gender, String emp_designation, double emp_salary, String emp_address) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        Emp_age = emp_age;
        Emp_gender = emp_gender;
        Emp_designation = emp_designation;
        Emp_salary = emp_salary;
        Emp_address = emp_address;
    }

    public void display () {
        System.out.println("ID: " + this.Emp_id + " Name: " + this.Emp_name + " Age: " + this.Emp_age + " Gender: " + this.Emp_gender + " Designation: " + this.Emp_designation + " Salary: " + this.Emp_salary + " emp_address: " + this.Emp_address);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];
        emp[0] = new Employee(1, "bob", 23, 'M', "manager", 48000, "miami");
        emp[1] = new Employee(2, "swan", 45, 'M', "engineer", 8908, "london");

        int id = 2;
        for (Employee e:
             emp) {
            if (e.getEmp_id() == id)
                e.display();
        }
    }
}
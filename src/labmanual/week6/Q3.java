/*
3. Write an application to create a super class Employee with information first name &
last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class objects
respectively.
 */
package labmanual.week6;

class Employee {
    private String fname;
    private String lname;

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}

class ContractEmployee extends Employee{
    private String dept;
    private String designation;

    public ContractEmployee(String fname, String lname, String dept, String designation) {
        super(fname, lname);
        this.dept = dept;
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "dept='" + dept + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

class RegularEmployee extends Employee {
    private String dept;
    private String designation;

    public RegularEmployee(String fname, String lname, String dept, String designation) {
        super(fname, lname);
        this.dept = dept;
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "dept='" + dept + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
public class Q3 {
    public static void main(String[] args) {
        // create object of regular employee
        RegularEmployee regularEmployee = new RegularEmployee("james", "bond", "cse", "HOD");
        System.out.print(regularEmployee);
        Double salary = (regularEmployee instanceof RegularEmployee)?12000.0 : 13000.0;
        System.out.printf(", Salary is %.3f\n",salary);

        // create object of contract employee
        ContractEmployee contractEmployee = new ContractEmployee("keenu", "reeves", "spy", "communicado");
        System.out.print(contractEmployee);
        salary = (contractEmployee instanceof ContractEmployee)?13000.0 : 12000.0;
        System.out.printf(", Salary is %.3f\n", salary);
    }
}

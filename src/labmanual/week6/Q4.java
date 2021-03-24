/*
4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
with information number of hours & wages per hour, number of weeks & wages per
week respectively & method calculateWages() to calculate their monthly salary. Also
override getDesig () method depending on the type of contract employee.
 */
package labmanual.week6;

class HourlyEmployee extends ContractEmployee{
    int hours;
    int wageperhour;

    public HourlyEmployee(String fname, String lname, String dept, String designation, int hours, int wageperhour) {
        super(fname, lname, dept, designation);
        this.hours = hours;
        this.wageperhour = wageperhour;
    }

    @Override
    public String getDesignation() {
        return "Hourly " + super.getDesignation();
    }

    public int calculateWages() {
        return this.hours * this.wageperhour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", wageperhour=" + wageperhour +
                '}';
    }
}

class WeeklyEmployee extends ContractEmployee {
    int weeks;
    int wageperweek;

    public WeeklyEmployee(String fname, String lname, String dept, String designation, int weeks, int wageperweek) {
        super(fname, lname, dept, designation);
        this.weeks = weeks;
        this.wageperweek = wageperweek;
    }

    @Override
    public String getDesignation() {
        return "weekly " + super.getDesignation();
    }

    public int calculateWages() {
        return this.weeks * this.wageperweek;
    }

    @Override
    public String toString() {
        return "WeeklyEmployee{" +
                "weeks=" + weeks +
                ", wageperweek=" + wageperweek +
                '}';
    }
}
public class Q4 {
    public static void main(String[] args) {
        // create HourlyEmployee class
        HourlyEmployee hourlyEmployee = new HourlyEmployee("joseph", "paul", "cse", "professor", 3, 500);
        System.out.print(hourlyEmployee);
        System.out.println(" and salary is " + hourlyEmployee.calculateWages());

        // create weeklyEmployee class
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee("james", "storm", "civil", "HOD", 4, 567);
        System.out.print(weeklyEmployee);
        System.out.println(" and salary is " + weeklyEmployee.calculateWages());
    }
}

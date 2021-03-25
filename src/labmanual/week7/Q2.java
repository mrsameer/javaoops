/*
2. Create an abstract class Employee with methods getAmount() which displays the
amount paid to employee. Reuse this class to calculate the amount to be paid to
WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.
 */
package labmanual.week7;

abstract class Employee {
    abstract Double getAmount();
}

class WeeklyEmployee extends Employee {

    private int weeks;
    private Double wageperWeek;

    public WeeklyEmployee(int weeks, Double wageperWeek) {
        this.weeks = weeks;
        this.wageperWeek = wageperWeek;
    }

    @Override
    Double getAmount() {
        return weeks * wageperWeek;
    }

    @Override
    public String toString() {
        return "WeeklyEmployee{" +
                "weeks=" + weeks +
                ", wageperWeek=" + wageperWeek +
                '}';
    }
}

class HourlyEmployee extends Employee {
    private int hours;
    private Double wageperHour;

    public HourlyEmployee(int hours, Double wageperHour) {
        this.hours = hours;
        this.wageperHour = wageperHour;
    }

    @Override
    Double getAmount() {
        return hours * wageperHour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", wageperHour=" + wageperHour +
                '}';
    }
}

public class Q2 {
    public static void main(String[] args) {
        // create Hourly Employee class
        HourlyEmployee hourlyEmployee = new HourlyEmployee(23, 560.0);
        System.out.print(hourlyEmployee);
        System.out.println(" and salary is: " + hourlyEmployee.getAmount());

        // create weekly Employee class
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(34, 5455.0);
        System.out.print(weeklyEmployee);
        System.out.println(" and salary is: " + weeklyEmployee.getAmount());
    }

}

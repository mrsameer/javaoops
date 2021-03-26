/*
3. Write a Java program to create package called dept. Create four classes as CSE, ECE,
ME and CE add methods in each class which can display subject names of your respect
year. access this package classes from main class
 */
package labmanual.week8;

import labmanual.week8.dept.CE;
import labmanual.week8.dept.Cse;
import labmanual.week8.dept.ECE;
import labmanual.week8.dept.ME;

public class Q3 {
    public static void main(String[] args) {
        new Cse().display();
        new ECE().display();
        new ME().display();
        new CE().display();
    }
}

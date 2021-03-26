/*
1. Write a program to create your own package. Package should have more than two classes. Write a class
that uses the package.
 */
package labmanual.week8;

import labmanual.week8.Q1.First;
import labmanual.week8.Q1.Second;

public class Q1Demo {
    public static void main(String[] args) {
        First f = new First();
        f.displayFirst();
        Second s = new Second();
        s.displaySecond();
    }
}

/*
 4. Write a calculator program: Include all calculator operations in as classes in a Package "Calculator" and
 import it to main class.
 */
package labmanual.week8;

import labmanual.week8.calculator.Add;
import labmanual.week8.calculator.Div;
import labmanual.week8.calculator.Mul;
import labmanual.week8.calculator.Sub;

public class Q4 {
    public static void main(String[] args) {
        new Add(1, 2, 3, 4);
        new Sub(1, 2);
        new Mul(1, 2, 3, 4, 5);
        new Div(5, 6);
    }
}

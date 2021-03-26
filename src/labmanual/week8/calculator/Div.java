/*
 4. Write a calculator program: Include all calculator operations in as classes in a Package "Calculator" and
 import it to main class.
 */
package labmanual.week8.calculator;

public class Div {
    public Div(int a, int b) {
        if (b == 0)
            System.out.println("Division bt 0 is not possible");
        else
            System.out.println("After division, the result is: "  + a/b);
    }
}

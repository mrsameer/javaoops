/*
 4. Write a calculator program: Include all calculator operations in as classes in a Package "Calculator" and
 import it to main class.
 */
package labmanual.week8.calculator;

public class Mul {
    public Mul(int ... args) {
        int result = 1;
        for (int arg:
             args) {
            result *= arg;
        }
        System.out.println("After multiplication result is: " + result);
    }
}

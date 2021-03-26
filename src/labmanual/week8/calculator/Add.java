/*
 4. Write a calculator program: Include all calculator operations in as classes in a Package "Calculator" and
 import it to main class.
 */
package labmanual.week8.calculator;

public class Add {
    public Add(int ... args) {
        int result = 0;
        for (int arg:
             args) {
            result += arg;
        }
        System.out.println("After addition result is: " + result);
    }
}

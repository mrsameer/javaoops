/*
 4. Write a calculator program: Include all calculator operations in as classes in a Package "Calculator" and
 import it to main class.
 */
package labmanual.week8.calculator;

public class Sub {
    public Sub(int ... args) {
        if (args.length > 0) {
            int result = args[0];
            for (int i = 1; i < args.length; i++) {
                result -= args[i];
            }
            System.out.println("After substraction, the result is: " + result) ;
        }
    }
}

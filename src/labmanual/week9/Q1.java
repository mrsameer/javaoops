/*
1. Program for demonstrating the use of throw, throws & finally - Create a class with a
main( ) that throws an object of class Exception inside a try block. Give the constructor
for Exception a String argument. Catch the exception inside a catch clause and print the
String argument. Add a finally clause and print a message to prove you were there.
 */
package labmanual.week9;

public class Q1 {
    public int show(int a, int b) throws ArithmeticException{

        return a/b;
    }
    public static void main(String[] args) {
        int a, b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            Q1 q1 = new Q1();

            if (b < 0)
                throw (new ArithmeticException("*****Message*****\nsecond argument is less than 0"));
            System.out.println("second argument is greater than 0 and number is: " + b);
            int c = q1.show(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Error found: " + e.getMessage());
        } finally {
            System.out.println("I am here in finally :)");
        }
    }
}

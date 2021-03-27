/*
3. Write a program to rethrow an exception – Define methods one() & two(). Method
two()
should initially throw an exception. Method one() should call two(), catch the
exception and rethrow it Call one() from main() and catch the rethrown
 */
package labmanual.week9;


public class Q3 {

    // one() tries to catch exception by one() and rethrows it
    public static void one() throws Exception {
        try {
            two();
        } catch (Exception e) {
            System.out.println("Inside one()");
            throw e;
        }
    }

    // initially two() throws exception
    public static void two() throws Exception {
        System.out.println("Inside two()");
        throw  new Exception("Thrown from two()");
    }

    // main tries to catch exception thrown by one() (one() catches exception from two() and rethrows Exception)
    public static void main(String[] args) {
        try {
            one();
        } catch (Exception e) {
            System.out.println("Caught in main");
        }
    }
}

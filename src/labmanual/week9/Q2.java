/*
2. Write a program that shows that the order of the catch blocks is important. If you try to
catch a superclass exception type before a subclass type, the compiler should generate
errors.
 */
package labmanual.week9;

class Test {
    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int result() {
        return (a/b);
    }
}

public class Q2 {
    public static void main(String[] args) {
        try {
            Test test = new Test(1, 0);
            System.out.println("The result of superclass is: " + test.result());
        } catch (Exception e){  // Exception is super class of ArithmeticException
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

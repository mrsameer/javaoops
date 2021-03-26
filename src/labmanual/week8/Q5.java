/*
5. Write a program for the following
    a. Example to use interface in the package.
    b. Example to create sub package in a package.
 */
package labmanual.week8;  // week8 is a sub package in package labmanual

// interface Hello in the package week8
interface Hello {
    void helloWorld();
}

public class Q5 implements Hello{
    @Override
    public void helloWorld() {
        System.out.println("Hello World");
    }
}

class Q5Demo {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.helloWorld();
    }
}
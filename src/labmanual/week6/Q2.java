/*
2. Write a Java program which can give example of Method overloading and overriding
 */
package labmanual.week6;

class Test {
    public void method() {
        System.out.println("In Test class");
    }
}

public class Q2 extends Test{
    public void method1() {
        System.out.println("In method1");
    }

    public void method1(int a ) {
        System.out.println("In overloaded method1 with argument a");
    }

    public void method() {
        System.out.println("In Q2 class (Overridden method)");
    }
}

class Q2Demo {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        // demonstration of method overloading
        q2.method1();
        q2.method1(0);

        //demonstration of method overriding
        q2.method();
    }
}
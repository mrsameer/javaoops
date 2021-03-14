/*
  Constructor will execute after creation of object immediately. For every object constructor will be executed
  immediately. How many objects we are creating, based on that those many number of times constructor will be executed.
 */
package constructors;

public class Test {
    public Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
    }
}

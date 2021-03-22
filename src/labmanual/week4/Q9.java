/*
9. Write an application that changes any given string with uppercase letters, displays
it, changes it back to lowercase letters and displays it.
 */
package labmanual.week4;

public class Q9 {
    public void change(String s) {
        System.out.println("After converting " + s + " to upper case: " + s.toUpperCase());
        System.out.println("After converting " + s + " to lower case: " + s.toLowerCase());
    }
}

class Q79Demo {
    public static void main(String[] args) {
        new Q9().change("javA");
    }
}
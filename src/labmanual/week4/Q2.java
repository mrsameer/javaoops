/*
 2. Write an application that uses String method equals and equalsIgnoreCase to tests any two string objects for equality.
 */
package labmanual.week4;

public class Q2 {
    public boolean isEquals(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
}

class Q2Demo {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        System.out.println(q2.isEquals("SAmeer", "Sameer")); // true
    }
}
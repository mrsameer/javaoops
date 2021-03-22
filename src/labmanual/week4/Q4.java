/*
4.  Write an application that uses String method concat to concatenate two defined strings.
 */
package labmanual.week4;

public class Q4 {
    public String concatenation(String s1, String s2) {
        return s1.concat(s2);
    }
}

class Q4Demo {
    public static void main(String[] args) {
        Q4 q4 = new Q4();
        System.out.println(q4.concatenation("mango ", "tree"));
        System.out.println(q4.concatenation("banana ", "fruit"));
    }
}
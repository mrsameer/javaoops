/*
7. Write an application that uses String method charAt to reverse the string.
 */
package labmanual.week4;

public class Q7 {
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

class Q7Demo {
    public static void main(String[] args) {
        Q7 q7 = new Q7();
        System.out.println(q7.reverse("java"));  // avaj
    }
}
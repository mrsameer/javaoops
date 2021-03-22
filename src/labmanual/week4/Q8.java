/*
8. Write an application that finds the substring from any given string using substring
method and startsWith & endsWith methods.
 */
package labmanual.week4;

public class Q8 {
    public void substr(String s) {

        // prints all possible substrings in a string
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }

        // checks whether string begins with specified substring or not
        System.out.println(s.startsWith("p"));
        System.out.println(s.startsWith("app"));
        System.out.println(s.startsWith("a"));

        // checks whether string ends with specified substring or not
        System.out.println(s.endsWith("e"));
        System.out.println(s.endsWith("le"));
        System.out.println(s.endsWith("p"));
    }

    public static void main(String[] args) {
        new Q8().substr("apple");
    }
}

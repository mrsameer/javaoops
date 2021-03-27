/*
5. Exception Handling program for NumberFormatException--thrown if a program is
attempting to convert a string to a numerical datatype, and the string contains
inappropriate characters (i.e. 'z' or 'Q').
 */
package labmanual.week9;

public class Q5 {
    public static void main(String[] args) {
        try {
            String s = "1l23";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}

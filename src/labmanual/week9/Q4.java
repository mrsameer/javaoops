/*
4. Exception Handling program for ClassNotFoundException--thrown if a program can not
find a class it depends at runtime (i.e., the class's ".class" file cannot be found or was
removed from the CLASSPATH).
 */
package labmanual.week9;

public class Q4 {
    public static void main(String[] args) {
        try {
            Class.forName("OOPS");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

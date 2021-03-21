/*
7.Example of command line arguments
 */
package labmanual.week2;

// example of command line argument that prints all the values
public class CommandLineArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("argument " + i + " is: " + args[i]);
        }
    }
}

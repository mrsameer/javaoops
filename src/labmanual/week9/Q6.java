/*
6. Create your own exception class using the extends keyword. Write a constructor for this
class that takes a String argument and stores it inside the object with a String reference.
Write a method that prints out the stored String. Create a try- catch clause to exercise your
new exception. */
package labmanual.week9;

import java.util.Scanner;

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
public class Q6 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        try {
            if (number > 0)
                System.out.println("Valid");
            else
                throw new UserException("Only non-zero positive integers are valid");
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}

/*
2. Write an application that prompts the user for the radius of a circle and uses a method
called circleArea to calculate the area of the circle and uses a method circlePerimeter to
calculate the perimeter of the circle.
 */
package labmanual.week5;

import java.util.Scanner;

public class Q2 {
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int option;
        Double radius;
        while (true) {
            System.out.print("1. Get area and perimeter\n2.Quit\n");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the radius: ");
                    radius = sc.nextDouble();
                    System.out.println("The area of the circle is: " + q2.circleArea(radius));
                    System.out.println("The perimeter of the circle is: " + q2.circlePerimeter(radius));
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Select correct choice");
            }
        }
    }
}

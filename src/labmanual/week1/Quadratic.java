/*
Write a Java program that prints all real and imaginary solutions to the quadratic equation
ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula
 */
package labmanual.week1;

import java.util.Scanner;

public class Quadratic {
    private int a;
    private int b;
    private int c;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printReal() {
        int det = this.b * this.b - 4 * a * c;
        if (det >= 0) {
            System.out.print("Real roots are: ");
            System.out.print((-b + Math.sqrt(det)) / (2*a) + ", ");
            System.out.print((-b - Math.sqrt(det)) / (2*a));
        }
    }

    public void printIm() {
        int det = this.b * this.b - 4 * a * c ;
        if (det < 0) {
            System.out.print("Imaginary roots are: ");
            System.out.printf("-%d + i%f/2%d", b, Math.sqrt(Math.abs(det)), a );
            System.out.printf(", -%d - i%f/2%d", b, Math.sqrt(Math.abs(det)), a );
        }
    }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();
        System.out.print("Enter the c: ");
        int c = sc.nextInt();

        Quadratic q = new Quadratic(a, b, c);
        q.printReal();
        q.printIm();
    }
}

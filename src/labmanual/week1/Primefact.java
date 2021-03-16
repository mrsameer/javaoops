/*
Write a java program to find prime factors of given number
 */
package labmanual.week1;

import java.util.Scanner;

public class Primefact {
    private int num;

    public Primefact(int num) {
        this.num = num;
    }

    public void printIfPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0)
                return;
        }
        System.out.print(num + " ");
    }

    public void printPrimefact() {
        System.out.println("The prime factors are: ");
        for (int i = 2; i < this.num; i++) {
            if (num % i == 0)
                this.printIfPrime(i);
        }
    }

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Primefact p = new Primefact(sc.nextInt());
        p.printPrimefact();
    }
}

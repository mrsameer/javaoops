package labmanual.week4;

import java.util.Scanner;

public class CompareStrings {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s1, s2;
        System.out.print("Enter the first string: ");
        s1 = sc.next();
        System.out.print("Enter the second string: ");
        s2 = sc.next();

        if (s1.compareTo(s2) > 0)
            System.out.println(s1 + " > " + s2);
        else if (s1.compareTo(s2) < 0)
            System.out.println(s1 + " < " + s2);
        else
            System.out.println(s1 + " = " + s2);
    }
}

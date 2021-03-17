/*
Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each
number is read display it only if it’s not a duplicate of any number already read
display the
complete set of unique values input after the user enters each new value
 */
package labmanual.week3;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElimination {

    private static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        int num;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter the number %d between 10 and 100 inclusive : ", i);
            num = sc.nextInt();
            set.add(num);
            System.out.println("Unique integers until now are: " + set);
        }
    }
}

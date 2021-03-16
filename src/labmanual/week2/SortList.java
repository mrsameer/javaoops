/*
Write a Java program to sort given list of numbers.
 */
package labmanual.week2;

import java.util.Arrays;

public class SortList {

    public static void sort(int[] array)  {
        Arrays.sort(array);
        for (int a:
             array) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 9};
        SortList.sort(arr);
    }
}

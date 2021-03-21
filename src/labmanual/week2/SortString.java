/*
6. Java program for sorting a given list of names
 */
package labmanual.week2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {
    public List<String> sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }
}

class SortStringDemo {
    public static void main(String[] args) {
        SortString ss = new SortString();
        List<String> list = Arrays.asList("apple", "carrot", "carat");
        System.out.println(ss.sort(list));
    }
}
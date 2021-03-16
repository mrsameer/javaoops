/*
Write a Java program to implement linear search.
Write a Java program to implement binary search.
 */
package labmanual.week2;

public class Search {

    public int linsearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

    public int binsearch(int[] array, int key) {
        int low = 0;
        int mid;
        int high = array.length - 1;
        while (low < high) {
            mid = (low + high) / 2;
            if (array[mid] == key)
                return mid;
            else if (array[mid] > key)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}

class SearchDemo {
    public static void main(String[] args) {
        Search s = new Search();
        int[] a1 = {1, 3, 0, -9, 5};
        int key = 9;
        int index = s.linsearch(a1, key);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index: " + index);

        int[] a2 = {3, 6, 9, 10};
        index = s.binsearch(a2, key);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index: " + index);
    }
}
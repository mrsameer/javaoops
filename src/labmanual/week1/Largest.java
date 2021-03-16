/*
Write an application that declares 5 integers, determines and prints the largest and smallest
in the group.
 */
package labmanual.week1;

public class Largest {
    private int a, b, c, d, e;

    public Largest(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public void largest() {
        int large = this.a;
        if (large < b)
            large = b;
        if (large < c)
            large = c;
        if (large < d)
            large = d;
        if (large < e)
            large = e;

        System.out.println("Largest number in the group is " + large);
    }

    public void smallest() {
        int small = this.a;
        if (small > b)
            small = b;
        if (small > c)
            small = c;
        if (small > d)
            small = d ;
        if (small > e)
            small = e;

        System.out.println("Smallest number in the group is " + small);
    }

    public static void main(String[] args) {
        int a = 5, b = 4, c = 4, d = 6, e = 5;
        Largest l = new Largest(a, b, c, d, e);
        l.largest();
        l.smallest();
    }
}

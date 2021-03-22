/*
6. Write a java program that finds the length of a given string
 */
package labmanual.week4;

public class Q6 {
    public int getLength(String test) {
        int length = 0;
        for (char c:
             test.toCharArray()) {
            length++;
        }
        return length;
    }
}

class Q6Demo {
    public static void main(String[] args) {
        Q6 q6 = new Q6();
        System.out.println(q6.getLength("sameer"));  //6
    }
}
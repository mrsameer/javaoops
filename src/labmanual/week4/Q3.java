/*
3.  Write  an  application  that  uses  String  method  indexOf  to  determine  the  total  number of occurrences of
any given alphabet in a defined text.
 */
package labmanual.week4;

public class Q3 {
    public int numberOfOccurences(String text, char alphabet) {
        int n = 0;
        int index = text.indexOf(alphabet);
        while (index >= 0) {
            n++;
            index = text.indexOf(alphabet, index + 1);
        }
        return n;
    }
}

class Q3Demo {
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        String text1 = "sameer";
        char alphabet1 = 'e';
        String text2 = "mango";
        char alphabet2 = 'o';
        System.out.println(alphabet1 + " occurred " + q3.numberOfOccurences(text1, alphabet1) + " times in " + text1);
        System.out.println(alphabet2 + " occurred " + q3.numberOfOccurences(text2, alphabet2) + " times in " + text2);
    }
}
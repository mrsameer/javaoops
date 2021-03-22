/*
 5. Write a java program to print all the vowels in a given string and count the number os vowels and consonants present
 in given string
 */
package labmanual.week4;

public class Q5 {
   public void count(String s) {
       int vowels = 0;
       int consonants = 0;
       System.out.print("Vowels are: ");
       for (int i = 0; i < s.length(); i++) {
           if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i' || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') {
               vowels++;
               System.out.print(s.charAt(i) + ", ");
           }
           else if (s.toLowerCase().charAt(i) >= 'a' && s.toLowerCase().charAt(i) <= 'z')
               consonants++;
       }
       System.out.println();
       System.out.println("Total vowels in this string are: " + vowels);
       System.out.println("Total consonants in this string are: " + consonants);
   }
}

class Q5Demo {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.count("apple");
        q5.count("banana");
    }
}
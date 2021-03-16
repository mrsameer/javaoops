/*
Write a java program to find whether given number is Palindrome or not
 */
package labmanual.week1;

public class Palindrome {
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public boolean isPalindrome(int num) {
        int revnum = 0;
        int temp = num;
        while (num != 0) {
            revnum = revnum * 10 + num % 10;
            num /= 10;
        }
        return revnum == temp;
    }
}

class PalindromeDemo {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        int num = 121;
        String s = "bob";
        boolean a = p.isPalindrome(num);
        if (a)
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
        a = p.isPalindrome(s);
        if (a)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
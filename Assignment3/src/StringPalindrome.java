import java.util.*;

public class StringPalindrome {

    //Reverse string
    public static boolean isPalindrome1(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    //Two pointer
    public static boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    //Integer palindrome
    public static boolean isPalindrome3(int num) {
        if (num < 0) return false;
        int original = num, rev = 0;
        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        return rev == original;
    }

    //Recursive string palindrome
    public static boolean isPalindrome4(String s) {
        return helper(s, 0, s.length() - 1);
    }

    private static boolean helper(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return helper(s, l + 1, r - 1);
    }

    //Using stack
    public static boolean isPalindrome5(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) st.push(s.charAt(i));
        int start = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        for (int i = start; i < n; i++) {
            if (st.pop() != s.charAt(i)) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        String str = "madam";
        int num = 1221;

        System.out.println("Palindrome 1 (reverse string) : " + isPalindrome1(str));
        System.out.println("Palindrome 2 (two pointer)    : " + isPalindrome2(str));
        System.out.println("Palindrome 3 (integer)        : " + isPalindrome3(num));
        System.out.println("Palindrome 4 (recursive)      : " + isPalindrome4(str));
        System.out.println("Palindrome 5 (using stack)    : " + isPalindrome5(str));
    }
}

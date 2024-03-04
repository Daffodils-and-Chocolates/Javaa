package Misc.Strings.easy;

import java.util.*;

public class ifAStringContainsAPalindromicSubstringOfEvenLength {
    @SuppressWarnings("all")
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String str = sc.next();
        System.out.println(palindromicEvenSubString(str));
    }

    static boolean palindromicEvenSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subString = str.substring(i, j + 1);
                if (Palindrome(subString) && subString.length() % 2 == 0)
                    return true;
            }
        }
        return false;
    }

    static boolean Palindrome(String str) {
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equals(temp)) {
            return true;
        }
        return false;
    }
}

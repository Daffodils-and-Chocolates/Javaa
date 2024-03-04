package Misc.Strings.easy;

import java.util.*;

public class MaxLengthOfKSubstringHavingSameCharacters {
    @SuppressWarnings("all")
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(countSubstringOfLength(str, k));
    }

    static int countSubstringOfLength(String str, int k) {
        int c = 0;
        for (int i = 0; i <= str.length() - k; i++) {
            String subString = str.substring(i, i + k);
            if (sameAllOver(subString)) {
                int count = 0;
                int index = str.indexOf(subString);

                while (index != -1) {
                    count++;
                    index = str.indexOf(subString, index + 1);
                }
                // System.out.println(subString + " count : "+count +" c : "+c);
                c = (c > count) ? c : count - 1;
            }
        }
        return c;
    }

    static boolean sameAllOver(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) != str.charAt(i+1)) return false;
        }
        return true;
    }
}

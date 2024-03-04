package Misc.Strings.easy;

import java.util.*;

class Playground {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String subStr = sc.next();
    }

    static int countSubstrings(String str, String subStr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String s3 = "";
            for (int j = i; j < str.length(); j++) {
                s3 += str.charAt(j);
                if (subStr.indexOf(s3) != -1)
                    count++;
            }
        }
        return count;
    }
}
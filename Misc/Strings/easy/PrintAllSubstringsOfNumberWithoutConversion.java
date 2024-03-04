package Misc.Strings.easy;

import java.util.*;

public class PrintAllSubstringsOfNumberWithoutConversion {
    @SuppressWarnings("all")
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        long n = sc.nextLong();
        printAllSubStrings(n);
    }

    static void printAllSubStrings(long n) {
        int length = 0;
        long u = n;
        while (u > 0) {
            u /= 10;
            length++;
        }
        for (int i = length; i > 0; i--) {
            long a = n % (int) Math.pow(10, i);
            for (int j = 1; j <= i; j++) {
                long s = a / (int)(Math.pow(10, i-j));
                System.out.println(s);
            }

        }
    }
}

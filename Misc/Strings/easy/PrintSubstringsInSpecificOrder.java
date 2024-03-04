package Misc.Strings.easy;

import java.util.Scanner;

public class PrintSubstringsInSpecificOrder {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length() - 1; i++) {
            // System.out.println("----------i : "+i+"--------");
            for (int j = 0; j < str.length(); j++) {
                if (j + i + 1 > str.length())
                    break;
                String subString = str.substring(j, j + i + 1);
                // System.out.println("("+j +" , "+ (j+i+1)+")" );
                System.out.println(subString);
            }
        }
    }
}

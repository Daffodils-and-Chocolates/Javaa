package Basic.PatternSearching;

import java.util.Scanner;

public class naiveAlgorithmPatternSearching {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "barbie";
        String s = "aa";
        char[] strArr = str.toCharArray();
        char[] sArr = s.toCharArray();
        int m = s.length();
        int n = str.length();
        for (int i = 0; i <= n - m; i++) {
            System.out.println("----------i : " + i + "--------");
            int j;
            for (j = 0; j < m; j++) {
                System.out.println("j : " + j + "\t\ti+j : " + (i + j));
                System.out.println("sArr : " + sArr[j] + "\tstrArr : " + strArr[i + j]);
                if (strArr[i + j] != sArr[j])
                    break;
            }
            if (j == m)
                System.out.println("Pattern at : " + i);
        }
    }
}

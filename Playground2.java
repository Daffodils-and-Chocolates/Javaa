import java.util.*;
import java.io.*;

public class Playground2 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        int value;
        while ((value = sc.nextInt()) !=-1) {
            input.append(Integer.toString(value));
        }
        String correct = input.toString().replace("\n", "");
        System.out.println(correct);
        System.out.println("input number of testcases");
        int t = sc.nextInt();
        // System.out.println("input the testcases");
        for (int i = 0; t-- > 0; i++) {
            int n = sc.nextInt();
            if (correct.charAt(i) == Integer.toString(findTwoGroups(n)).charAt(0))
                System.out.println("deviation at " + n);
        }
    }

    static int findTwoGroups(int n) {
        int sum = (n * (n + 1)) / 2;
        float a = (sum - 2 * n) / 2;
        int x = (int) Math.ceil(a);
        return Math.abs(sum - 2 * (n + x));
    }
}

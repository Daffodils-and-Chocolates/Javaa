package adventOfCode.Year2015;

import java.util.Scanner;

public class Day2Part2 {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Long sum = 0L;
        while (sc.hasNextLine()) {
            String dimensions = sc.next();

            String[] parts = dimensions.split("x");
            sum+= ribbonNeeded(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]) , Integer.parseInt(parts[2]));
        }
        System.out.println(sum);
    }
    private static int ribbonNeeded(int l, int w, int h){
        int t;
        int max = Math.max(l, Math.max(w, h));
        t = ((2*l + 2*w + 2*h) - 2*max);
        t += (l*w*h) ;
        return t;
    }
}

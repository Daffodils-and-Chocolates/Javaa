package adventOfCode.Year2015;

import java.util.Scanner;

public class Day2 {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Long sum = 0L;
        while (sc.hasNextLine()) {
            String dimensions = sc.next();

            String[] parts = dimensions.split("x");
            sum+= wrappingPaperNeeded(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]) , Integer.parseInt(parts[2]));
        }
        System.out.println(sum);
    }
    private static int wrappingPaperNeeded(int l, int w, int h){
        int t = 2*l*w + 2*w*h + 2*h*l;
        int max = Math.max(l, Math.max(w, h));
        t += ((l*w*h)/max);
        return t;
    }
}

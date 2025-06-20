package adventOfCode.Year2015;

import java.util.Objects;
import java.util.Scanner;

public class Day1Part2 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int a = sc.nextInt();
        int sum =0;
        int i;
        for (i = 0; i < input.length(); i++) {
            if(Objects.equals(input.charAt(i), '(')){
                sum ++;
            }
            else {
                sum --;
            }
            if(a == sum){
                break;
            }
        }
        System.out.println(++i);
    }

}

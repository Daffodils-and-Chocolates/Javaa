import java.util.*;
import java.io.*;

public class Playground2 {
    @SuppressWarnings("all")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum =0;
        for (int i = 0; i < input.length(); i++) {
            if(Objects.equals(input.charAt(i), '(')){
                sum ++;
            }
            else {
                sum --;
            }
        }
        System.out.println(sum);
    }
}

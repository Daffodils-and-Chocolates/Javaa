package Class.Random;
import java.util.*;
public class BitMaskingIsBitSet {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int a = 1<<(k-1);
        int b = num&a;
        if(b==0)System.out.println("not set");
        else System.out.println("bit is set");
    } 
}

package Class.BitMasking;
import java.util.*;
public class FindTrailingZeroesInBits {
    @SuppressWarnings ("all")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int count=0;
        long r=0;
        for(int i=1;r==0;i++){
            int m= 1<<(i-1);
            r = n&m;
            count = (r==0)?count+1:count;
        }
        System.out.println(count);
    } 
}
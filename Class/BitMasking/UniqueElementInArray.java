package Class.BitMasking;
import java.util.*;
public class UniqueElementInArray {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,5,3,1,5};
        int result =0;
        for(int i:arr){
            result ^= i;
        } 
        System.out.println(result);
    } 
}
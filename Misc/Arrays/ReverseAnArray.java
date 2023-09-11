package Misc.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseAnArray {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        int[] arr= {1,2,3,4,5,7,6};
        int l = arr.length;
        int i,j;
        for(i=0,j=l-1;i<l/2;i++,j--){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}

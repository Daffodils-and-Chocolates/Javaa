//nth palindromic in binary representations
package Class.BitMasking;
import java.util.*;
public class FindPalindrome {
    @SuppressWarnings ("all")
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        int n=sc.nextInt();
        int result = findPalindrome(n);
        System.out.println(result);
   } 
   static int findPalindrome(int n){
        int num, count =0;
        for(num=1;count<n;num++){
            String str = Integer.toBinaryString(num);
            if(isPalindrome(str)) count++;
        }
        return num-1;
   }
   static boolean isPalindrome(String str){
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        return temp.toString().equals(str);
   }
}

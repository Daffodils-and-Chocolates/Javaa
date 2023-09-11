package Class.Strings;
import java.util.*;
public class Anagram {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        String s1 = sc.nextLine();
        sc.nextLine();
        String s2 = sc.nextLine();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2); 
   } 
}

package Misc.Strings.easy;
import java.util.*;

public class checkWhetherGivenStringCanBeGeneratedAfterConcatingWithTheOther {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.next();
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = str1.concat(str2);
        System.out.println(str.equals(str3));
    }
}

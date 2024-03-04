package Misc.Strings.easy;
import java.util.*;

public class CheckIfGivenStringIsKPeriodic {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(kPeriodic(str, k));
    }
    static boolean kPeriodic(String str, int k){
        String sub = str.substring(0,k);
        for(int i=0;i<str.length();i+=k){
            String checkSub = str.substring(i, i+k);
            if(sub.equals(checkSub) == false) return false;
        }
        return true;
    }
}

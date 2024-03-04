/*Input: S = "471", X = 47
Output: 2
Only the sub-strings "471" and "71" 
satisfy the given conditions.
Input: S = "2222", X = 97
Output: 3
Valid strings are "222", "222" and "2222".*/
package Misc.Strings.easy;
import java.util.*;

public class CountNumberOfSubStringsWithNumericValueOverX {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.next();
        int X = sc.nextInt();
        System.out.println(countNumberOfSubstringGreaterThanX(str, X));
    }
    static int countNumberOfSubstringGreaterThanX(String str, int x){
        int c=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String subString = str.substring(i, j+1);
                int subStringValue = Integer.valueOf(subString);
                if(subStringValue > x) c++;
            }
        }
        return c;
    }
}

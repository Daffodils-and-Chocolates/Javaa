package Misc.Strings.easy;
import java.util.*;

public class SubstringReversePattern {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.next();
        reversePattern(str);
    }
    static void reversePattern(String str){
        //reverse string
        StringBuilder revStr =  new StringBuilder(str).reverse();
        // System.out.println(revStr);
        for(int i=0;i<str.length()/2;i++){
            revStr.setCharAt(i, '*');
            revStr.setCharAt(str.length()-i-1 , '*');
            System.out.println(revStr);
        }
    }
}

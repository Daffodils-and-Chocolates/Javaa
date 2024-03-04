package Misc.Strings.easy;
import java.util.*;

public class countOfPalindromicSubStrongOfAStringInItsSortedForm {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.next();
        System.out.println(printAllPalindromicSubstrings(sortingString(str)));
    }
    static int printAllPalindromicSubstrings(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String subString = str.substring(i, j+1);
                if(Palindrome(subString)){
                    // System.out.println(subString);
                    c++;
                }
            }
        }
        return c;
    }
    static boolean Palindrome(String str){
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equals(temp)) return true;
        return false;
    }
    static String sortingString(String str){
        String sortedStr;
        char[] arr = str.toCharArray();
        //selection sort solve with min element
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1 ; j<arr.length ; j++){
                min = (arr[j]<arr[min])? j : min ;
            }
            if (min!=i) swap(arr, i, min);
        }
        sortedStr = new String(arr);
        return sortedStr;
    }
    static void swap(char[] arr,int a,int b){
        char t=arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}

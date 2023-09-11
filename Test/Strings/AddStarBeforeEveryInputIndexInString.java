package Test.Strings;
import java.util.*;
public class AddStarBeforeEveryInputIndexInString {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String forArr = sc.nextLine();
        int[] chars = stringToArray(forArr);
        String s ="";
        int j=0;
        for(int i=0;i<str.length();i++){
            if(i==chars[j]){
                j=(j+1>=chars.length)?j:++j;
                s+="*";
            }
            s+=str.charAt(i);
        }
        System.out.println(s);
    }
    static int[] stringToArray(String str){
        String[] string = str.split(" ");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        return arr;
    } 
}
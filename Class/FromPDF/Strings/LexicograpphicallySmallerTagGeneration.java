package Class.FromPDF.Strings;
import java.util.*;
public class LexicograpphicallySmallerTagGeneration {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length-1;i+=2){
            System.out.print((char)Math.max(arr[i],arr[i+1]));
        }
        if(arr.length%2!=0)System.out.println(arr[arr.length-1]);
    }
}

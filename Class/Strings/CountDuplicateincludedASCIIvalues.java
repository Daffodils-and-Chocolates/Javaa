package Class.Strings;
import java.util.*;
public class CountDuplicateincludedASCIIvalues {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        String str = sc.nextLine();
        String ch  = sc.nextLine();
        ch = ch.replaceAll("\\s", "");
        int sum=0;
        for(int i=0;i<ch.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch.charAt(i))count++;
            }
            sum+=ch.charAt(i)+count;
        }
        System.out.println(sum);
   } 
}

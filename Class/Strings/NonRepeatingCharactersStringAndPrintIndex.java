package Class.Strings;
import java.util.*;
public class NonRepeatingCharactersStringAndPrintIndex {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        String str = sc.nextLine();
        int n = sc.nextInt();
        String dupli = "";
        outer:
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i==j)continue;
                if(str.charAt(i)==str.charAt(j))continue outer;
            }
            dupli+=str.charAt(i);
        }
        System.out.println(dupli.charAt(n-1));
   } 
}

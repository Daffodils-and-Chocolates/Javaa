package Class.Strings;
import java.util.*;
public class abcdef_defghi{
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.nextLine();
        int n = sc.nextInt();
        String ans="";
        for(int i=0;i<str.length();i++,n++){
            if(str.length()<=n){
                char c = ans.charAt(i-1);
                c++;
                if((int)c==92)c=65;
                else if((int)c==123)c=97;
                ans+=c;
            }
            else{
                ans+=str.charAt(n);
            }
        }
        System.out.println(ans);
    }
}
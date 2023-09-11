package Class.Strings;
import java.util.*;
public class a2b2c2a1b1c1d1 {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        String str = sc.nextLine();
        int count=1;
        for(int i=1;i<str.length();i++){
            // System.out.print("char:"+ str.charAt(i)+"\t");
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                System.out.print(str.charAt(i-1)+""+count);
                count=1;
            }
            if(i+1==str.length()){
                System.out.print(str.charAt(i)+""+count);
            }
        }
    }
}
package Class.Strings;
import java.util.*;
public class Panagram {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        String str = sc.nextLine();
        float charSum=0,numSum=0,specialSum = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) numSum++;
            else if(Character.isLetter(str.charAt(i))) charSum++;
            else specialSum++;
        }
        float charPer = (charSum/str.length())*100;
        float numPer = (numSum/str.length())*100;
        float specialPer = (specialSum/str.length())*100;
        System.out.println("Character percentage: "+charPer+"\nNumber percentage: "+numPer+"\nSpecial Characters percentage: "+specialPer);
   } 
}


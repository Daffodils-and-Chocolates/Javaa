package Class.Strings;
import java.util.Scanner;

public class ToggleLowerUpperCase {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        toggle(str);
    }
    static void toggle(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(UpperCase(a)) s+= Character.toLowerCase(a);
            else if(!UpperCase(a)) s+=Character.toUpperCase(a);
            else if(a==' ') s+=' ';
        }
        System.out.println(s);
    }
    static boolean UpperCase(char a){
        if(Character.isUpperCase(a)) return true;
        else return false;
    } 
}

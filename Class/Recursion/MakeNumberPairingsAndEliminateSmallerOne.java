package Class.Recursion;
import java.util.*;
public class MakeNumberPairingsAndEliminateSmallerOne {
    @SuppressWarnings ("all")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        tagYouReIt(str,0);
    }
    static void tagYouReIt(String str, int i){
        //base case 
        if(i+1 >= str.length()){
            System.out.println(str);
            return;   
        }
        //else compare index and index+1 and delete
        int notDelete = ((int)str.charAt(i) > (int)str.charAt(i+1))? i : i+1;
        tagYouReIt(str.substring(0,i) + str.charAt(notDelete) + str.substring(i+2),i+1);
    }
}
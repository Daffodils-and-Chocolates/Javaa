package Test.Strings;
import java.util.*;
public class AllPossibleSequencedSubstrings {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int l=1;l<=str.length();l++){
            for(int i=0;i+l<=str.length();i++){
                System.out.println(str.substring(i, i+l));
            }
        }
    }
}

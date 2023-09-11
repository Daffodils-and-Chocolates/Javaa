package Test.Strings;
import java.util.*;
public class LeftAndRightRotationsByDthElement {
    @SuppressWarnings ("resource")
    public static void main(String args[]){Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int d = sc.nextInt();
        int n = s.length();
        if(n<d){
            System.out.println("-1");
        }
        else{
            String Rra = s.substring(d)+s.substring(0, d);
            String Lra ="";
            for(int i=n-1;i>=0;i--){
                Lra += Rra.charAt(i);
            }
            System.out.println(Rra);
            System.out.println(Lra);
        }
    }
}
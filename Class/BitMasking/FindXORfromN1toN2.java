package Class.BitMasking;
import java.util.*;

public class FindXORfromN1toN2 {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(FindXORFrom(n1,n2));;
    }
    static int FindXORFrom(int n1, int n2){
        return findXOR(n2) ^ findXOR(n1 - 1); 
    }
    static int findXOR(int n){
        if(n%4==0) return n;
        else if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else return 0;
    }
}

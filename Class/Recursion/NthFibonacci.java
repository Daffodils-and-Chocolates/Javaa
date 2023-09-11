package Class.Recursion;
import java.util.*;
public class NthFibonacci {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    
   } 
   static int Fibonacci(int n){
        if(n==0) return 0;
        else return n+Fibonacci(n-1);
   }
}

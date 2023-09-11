package Basic;
import java.util.*;

public class GuessTheNumber {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //generating random number
      int a = (int)(Math.random()*100);
      // System.out.println(a);
      System.out.println("Enter a Number");
      int n = sc.nextInt();
      do{
         if(n==0){
            System.out.print("Game over\nThe number was:");
            System.out.println(a);
            break;
         }
         else if(n<a){
            System.out.println("Number is greater");
         }
         else if(n>a){
            System.out.println("Number is smaller");
         }
         n = sc.nextInt();
      }while(n!=a);
      if(n!=0){
         System.out.println("You are correct");
      }
      sc.close();
   }
}

/*Prepare a class REVERSE in java that holds a functions
1. rev() //this is a function that has the ability to reverse a no
Followed by a class ABILITY_1 that inherits the class REVERSE so that it can check
1. palindrome() //checks for the value to be palindrome after receiving the value from rev)
2. display) //displays whether the entered no is palindrome or not
Create a last class INPUT that actually accepts input from the user and passes it to the REVERSE class and calls the respective function to check whether the entered
no is palindrome or not.
Sample Input 1:
121
Sample Output 1:
PALINDROME
Sample Input 1:
123
Sample Output 1:
NOT PALINDROME */
package Test.InheritanceClasses;
import java.util.Scanner;
public class ReverseClassPalindromInheritance {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        INPUT obj = new INPUT();
    }
}
class REVERSE{
    public int rev(int n){
        int u = 0;
        while(n>0){
            u=u*10+n%10;
            n/=10;
        }
        return u;
    }
}
class ABILITY_1 extends REVERSE{
    public boolean palindrome(int n){
        int r = rev(n);
        if(r==n) return true;
        else return false;
    }
    public void display(int n){
        if(palindrome(n)==true) System.out.println("PALINDROME");
        else System.out.println("NOT PALINDROME");
    }
}
class INPUT extends ABILITY_1{
    int n;
    public INPUT(){
        n = ReverseClassPalindromInheritance.sc.nextInt();
        display(n);
    }
}
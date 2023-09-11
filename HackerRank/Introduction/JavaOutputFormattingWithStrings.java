/*Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of
alphabetic characters, and each integer will be in the inclusive range from to

.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly
characters.
The second column contains the integer, expressed in exactly

digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================
 */
package HackerRank.Introduction;
import java.util.Scanner;

public class JavaOutputFormattingWithStrings{
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s=sc.next();
            int x=sc.nextInt();
            display(s,x);
            System.out.println();
        }
        System.out.println("================================");
    }
    
    static void display(String s, int n){
        //first column containing the string
        System.out.print(s);
        int l = s.length();
        for(int i=l;i<15;i++){
            System.out.print(" ");
        }
        //second column
        int ln = String.valueOf(n).length();
        while(ln<3){
            System.out.print("0");
            ln++;
        }
        System.out.print(n);
    }
}
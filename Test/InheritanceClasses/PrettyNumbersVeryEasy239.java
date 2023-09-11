/*Amrit likes the number 239. Therefore, he considers a number pretty if its last digit is 2, 3 or 9.Amrit wants to watch the numbers between Land R (both inclusive), so
he asked you to determine how many pretty numbers are in this range. Can you help him?
Input
The first line of the input contains two space-separated integers L (start no) and R (end no).
Output
For given Land R, print a single line containing one integer - the number of pretty numbers between Land R.
Condition: Help Amrit to make the code in Inheritance only. You can take two classes first (base) and second (derived) class. Take Inputs and make logic in first class
and display the result into second class.
Sample Input 1:
110
Sample Output 1:
3
Sample Input 2:
11 33
Sample Output 2:
8
Explanation:
Example case 1: The pretty numbers between 1 and 10 are 2, 3 and 9.
Example case 2: The pretty numbers between 11 and 33 are 12, 13, 19, 22, 23, 29, 32 and 33. */
package Test.InheritanceClasses;
import java.util.Scanner;
public class PrettyNumbersVeryEasy239 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int t=0;
        for(int i =l;i<=r;i++){
            if(doesItEndIn(i)) t++;
        }
        System.out.print(t);
    }
    static boolean doesItEndIn(int n){
        int a = n%10;
        if(a==2||a==3||a==9) return true;
        else return false;
    }
}
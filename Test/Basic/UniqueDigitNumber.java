/*Given two non-negative integers n1 and n2, where n1 < n2. The task is to find the total
number of integers in the range interval [n1, n2] (both inclusive) which have no repeated
digits.
Sample input1:
11
15
Sample output1:
4
Explanation:
n1 = 11 and n2 = 15
There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no
repeated digits. So, the output is 4.
Sample input2:
101
200
Sample output2:
72*/
package Test.Basic;
import java.util.Scanner;
public class UniqueDigitNumber {
    @SuppressWarnings ("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int t=0;
        for(int i =n1;i<=n2;i++){
            if(IsNotRepeated(i)){
                t++;
            }
        }
        System.out.println(t);
    }
    static boolean IsNotRepeated(int n){
        for(;n>0;n/=10){
            int u = n/10;
            int l = n%10;
            for(;u>0;u/=10){
                if(u%10==l){
                    return false;
                }
            }
        }
        return true;
    }
}
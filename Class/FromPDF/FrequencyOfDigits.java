/*Q.1. Given an array, consisting of digits, find the frequency of each digit in the given array.
Sample Input 1
10
2 1 1 4 7 2 5 5 0 6

Sample Output 1 
1 2 2 0 1 2 1 1 0 0 
Explanation 1
In the given string:
•	1,2 and 5 occurs two times.
•	0, 4, 6 and 7 occur one time each.
•	The remaining digits 3,8 and 9 don't occur at all.*/
package Class.FromPDF;
import java.util.Scanner;
public class FrequencyOfDigits {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){//array input
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            System.out.print(c + " ");
        }
    }
}

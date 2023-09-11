/*Print a pattern of numbers from 1 to n as shown below.
Sample Input 1
2

Sample Output 1 
222
212
222*/
package Class.FromPDF;
import java.util.Scanner;

public class Pattern222{
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2*n -1;
        for(int i=1;i<=s;i++){
            int v =n;
            for(int j=1;j<=s;j++){
                System.out.print(v);
                if(j<i) v--;
                if(j>s-i) v++;
            }
        System.out.println();
        }
    }
}
/* Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate
the array clockwise by K.
Input Explanation
1st line input consists single integer value N,
2nd line input consists N number of elements,
3rd line input consists single integer value K.
Output Explanation
Output consists of clockwise rotated array.
Sample Input 1
5
2
10 20 30 40 50
Sample Output 1
40 50 10 20 30
Sample Input 2
7
23 45 65 21 76 43 99
5
Sample Output 2
65 21 76 43 99 23 45 */
package Test.Arrays;
import java.util.Scanner;
public class RotateArrayClockwiseWithStep {
    @SuppressWarnings ("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        SortingTheArray(arr,k);
        display(arr);
    }
    static void SortingTheArray(int[] arr, int k){
        int n = arr.length;
        int i,ci;
        int l=n-k;
        for(i = 0,ci=1;i<l;i++,ci++){
            int cj=1;
            for(int j =n-ci;cj<=k;cj++){
                int t= arr[j];
                if(j==n-1){
                    arr[j]=arr[0];
                    arr[0]=t;
                    j =0;
                }
                else{
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    j++;
                }
                display(arr);
                System.out.println("");
            }
        }
    }
    static void display(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
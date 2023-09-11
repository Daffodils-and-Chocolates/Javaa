/*Amrit have two parallel classes on single time, he is making a single list of roll nos. & want to merge the roll nos. of two classes into single
class. Help Amrit to do his by input two lists of arrays of M and N length respectively and merge two lists into single list in descending
order.
Explanation:
Input M (int)
Input first array elements of M length
Input N (int)
Input second array elements of N length
Output will be (M+N) length of descending array.
Condition: Array size must be greater than 0 and can be less than or equals to 20.
Sample Input 1:
4
3 1 45
5
26 7 89
Sample Output 1:
9
8
7
6
5
4
3
2
1
2
21
3
2 3 4
Sample Input 2:
Sample Output 2:
3
2
2*/
package Test.Arrays;
import java.util.Scanner;

public class MergeAndSortArray {
    @SuppressWarnings ("all")
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int[] arrM = new int[m];
            for(int i =0;i<m;i++){//take 1st Array input
                arrM[i]=sc.nextInt();
            }
            int n = sc.nextInt();
            int[] arrN = new int[n];
            for(int i=0;i<n;i++){//take 2nd Array input
                arrN[i]=sc.nextInt();
            }
            int[] MergeArr = new int[n+m];
            for(int i=0;i<m;i++){//Merging 1st array to Merged
                MergeArr[i]= arrM[i];
            }
            int j =0;
            for(int i=m;i<n+m;i++,j++){//Merging 2nd array to Merged
                MergeArr[i]=arrN[j];
            }
            display(MergeArr);
            Sorting(MergeArr);
            display(MergeArr);
        }
        static void Sorting(int[] arr){
            int n = arr.length;
            int x,xi=0;
            for(int i=0;i<n;i++){
                x=getMaxInLimit(arr,i);
                for(int j=i;j<n;j++){
                    if(arr[j]==x){
                        // System.out.println("this is inside if");
                        xi=j;
                    }
                }
                // System.out.println("x:"+x+"  arr[i]:"+arr[i]+"  xi:"+xi);
                int t= arr[i];
                arr[i]=x;
                arr[xi]=t;
                // display(arr);
            }
        }
        static int getMaxInLimit(int[] arr,int a){
            int n = arr.length;
            int max = arr[a];
            for(int i=a+1;i<n;i++){
                max = Math.max(max,arr[i]);
            }
            return max;
        }
        static void display(int arr[]){
            int n = arr.length;
            for(int i = 0; i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
}
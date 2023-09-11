package Test.Arrays;
import java.util.Scanner;
public class SecondLargestInArray {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){//array input
            arr[i]=sc.nextInt();
        }
        int max = maxInArray(arr);//found out the largest in the array
        int max2 = -1;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                max2 = Math.max(max2,arr[i]);
            }
        }
        System.out.println(max2);
    }
    static int maxInArray(int[] arr){//function to find the largest in the array
        int n = arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
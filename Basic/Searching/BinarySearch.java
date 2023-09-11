package Basic.Searching;
import java.util.*;
public class BinarySearch {
   @SuppressWarnings ("all") 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String forArr = sc.nextLine();
        int[] arr = stringToArray(forArr);
        System.out.println("Enter key:");
        int k = sc.nextInt();
        System.out.println(BinarySearchh(arr,k));
    }
    static int BinarySearchh(int arr[], int k){
        int l=0; 
        int h = arr.length-1;
        while(l!=h){
            int m = (l+h)/2;
            if(k>arr[m]) l=m+1;
            else if(k<arr[m]) h = m-1;
            else if(k==arr[m]) return m;
        }
        return -1;
    }
    static int[] stringToArray(String str){
        String[] string = str.split(" ");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        return arr;
    }
}
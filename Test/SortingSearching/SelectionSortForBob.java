package Test.SortingSearching;
import java.util.*;
public class SelectionSortForBob {
    @SuppressWarnings ("resource")
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String forArr = sc.nextLine();
        int[] arr = stringToArray(forArr);
        display(arr);
        selectionSort(arr);
        display(arr);
   } 
   static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx]) min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
   }
    static int[] stringToArray(String str){
        String[] string = str.split(" ");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        return arr;
    }
    static void display(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

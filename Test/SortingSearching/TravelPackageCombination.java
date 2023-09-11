package Test.SortingSearching;
import java.util.*;
public class TravelPackageCombination {
    @SuppressWarnings ("resource")
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String forArr = sc.nextLine();
        int[] arr = stringToArray(forArr);
        for (int i = 0; i < arr.length; i++)
        for (int j = i; j < arr.length; j++) {
            for (int k = i; k <=j; k++)
                System.out.print(arr[k] + " ");
                System.out.println("");
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
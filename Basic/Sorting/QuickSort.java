package Basic.Sorting;
import java.util.*;

public class QuickSort {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr,int s,int e){
        int n = e-s;
        if(n<=1) return;

        int p = arr[e-1];
 
        int i = (s - 1);
 
        for (int j = s; j < e - 1; j++) {
 
            if (arr[j] < p) {
                 i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, e-1);
        p = i+1;
        // System.out.println(Arrays.toString(arr));
        quickSort(arr, s, p);
        quickSort(arr, p+1, e);
    }
    static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}

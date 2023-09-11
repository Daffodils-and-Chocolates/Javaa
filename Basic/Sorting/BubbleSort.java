package Basic.Sorting;
import java.util.*;
public class BubbleSort {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSortt(arr);
        display(arr);
    }
    static void BubbleSortt(int arr[]){
        int n = arr.length;
        while(n-->1){
            for(int i=0;i<n;i++){
                if(arr[i]>arr[i+1]){//swap
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] =t;
                }
            }
        }
    }
    static void display(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
}
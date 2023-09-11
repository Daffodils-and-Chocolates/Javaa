package Basic.Sorting;
import java.util.*;
public class SelectionSort {
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
        SelectionSortt(arr);
        display(arr);
    }
    static void SelectionSortt(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                min = (arr[min]<arr[j])? min: j;
            }
            if(min!=i) {//swap
                int t = arr[min];
                arr[min]=arr[i];
                arr[i]=t;
            }
        }
    }
    static void display(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
}
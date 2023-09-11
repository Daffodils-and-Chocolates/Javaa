import java.util.Arrays;
import java.util.Scanner;

public class Playground {
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
        zeroAndOne(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void zeroAndOne(int[] arr){
        
    }
}
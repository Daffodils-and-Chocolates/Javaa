package Misc.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SwapLastRowWithLastColumn {
    //    @SuppressWarnings ("resource")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int[][] arr = new int[x][y];
        int[][] arr={{2,1,9,4},{3,2,5,6},{5,3,4,7},{9,1,4,8}};
        int x=arr.length;
        display(arr);
        int y = arr[0].length;
        int i=x-1;
        for(int j=0;j<y;j++){
            int t= arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=t;
        }
        // int l = arr.length;
        // for(int c =0;;c++){

        // }
        display(arr);
    }
    static void display(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");                
            }
            System.out.println();
        }
        System.out.println();
    }
}

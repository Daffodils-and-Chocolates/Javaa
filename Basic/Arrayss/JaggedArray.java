package Basic.Arrayss;
import java.util.Scanner;
public class JaggedArray {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
        int[][] arr= new int[4][];
        arr[0]=new int[4];
        arr[1]=new int[1];
        arr[2]=new int[2];
        arr[3]=new int[3];
        System.out.println("Input array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        display(arr);
        }
    static void display(int arr[][]){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    } 
}

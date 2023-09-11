package Basic.Arrayss;
import java.util.Arrays;
import java.util.Scanner;
public class PrintingAnArray {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    int[] arr= {1,2,3,4,5,6};
    int[][] arr2d = {{1,2,3},{4,5,6}};
    System.out.print("\tWAYS TO PRINT AN ARRAY\n\nCan be done using a loop:\n");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println("\nCan also be done by using the Arrays.toString():\n"+Arrays.toString(arr));
    System.out.println("But it will not print 2d arrays correctly:\n"+Arrays.toString(arr2d));
    System.out.println("\nFor 2d arrays we can use Arrays.deepToString():\n"+Arrays.deepToString(arr2d));
   } 
}

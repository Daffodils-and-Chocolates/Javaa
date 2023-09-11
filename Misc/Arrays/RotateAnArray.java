package Misc.Arrays;
import java.util.Scanner;
public class RotateAnArray {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      int[][] arr= {{1,2,7,8},{3,4,9,6},{5,6,8,89}};
      int r=arr.length;
      int c = arr[0].length;
      int[][] leftArr= new int[c][r];
      int[][] rightArr= new int[c][r];
      int i,j,m,n;
      for(i=0,m=c-1;i<c;i++,m--){//left rotate
         for(j=0,n=0;j<r;j++,n++){
            leftArr[i][j]=arr[n][m];
         }
      }
      for(i=0,m=0;i<c;i++,m++){//right rotate
         for(j=0,n=0;j<r;j++,n++){
            rightArr[i][j]=arr[n][m];
         }
      }
      System.out.println("Original array:");
      display(arr);
      System.out.println("left rotate array:");
      display(leftArr);
      System.out.println("Right rotate array:");
      display(rightArr);
   }
   static void display(int[][] arr) {
      int r = arr.length;
      int c = arr[0].length;
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            // System.out.println("r:"+r+"c:"+c);
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
   }
}

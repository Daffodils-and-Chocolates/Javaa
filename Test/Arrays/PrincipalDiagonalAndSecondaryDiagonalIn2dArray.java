package Test.Arrays;
import java.util.Scanner;
public class PrincipalDiagonalAndSecondaryDiagonalIn2dArray {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){//array input
            for(int j=0;j<n;j++){
            arr[i][j]= sc.nextInt();
            }
        }
        int psum =0, ssum=0;
        for(int i=0;i<n;i++){
            psum+=arr[i][i];
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    ssum+=arr[i][j];
                }
            }
        }
        System.out.println("Principal Diagonal Sum: "+psum);
        System.out.println("Secondary Diagonal Sum: "+ssum);
    }
}

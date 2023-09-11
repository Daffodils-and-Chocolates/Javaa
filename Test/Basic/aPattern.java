// for n= 5
// 555555555
// 544444445
// 543333345
// 543222345
// 543212345
// 543222345
// 543333345
// 544444445
// 555555555
package Test.Basic;
import java.util.Scanner;

public class aPattern{
    // @SuppressWarnings ("resource")
    public static void main(String args[]){
        int i,j,k,kc;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = (n*2)-1;
        int arr[]= new int[n];
        for(i=1,k=0;i<=s;i++){ //row-wise
            for(j=0,kc=0;j<n;j++){//what happens inside the line
                arr[j]=n-kc;
                if(kc<k) kc++;
            }
            if(i<n) k++;
            else k--;
            for(int x=0;x<n;x++){//printing straight array
                System.out.print(arr[x]);
            }
            for(int x=n-2;x>=0;x--){//printing reverse array
                System.out.print(arr[x]);
            }
            System.out.println();
        }
    }
}
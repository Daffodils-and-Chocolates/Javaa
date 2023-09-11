package Class.Random;
import java.util.Scanner;

public class ArrPrintNumberifFrequencySame {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){//array input
            arr[i]=sc.nextInt();
        }
        System.out.print("The Array was:"+"[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        System.out.println("Numbers are:");
        for(int i=0;i<n;i++){//Current number counter
            int dupli=0;
            for(int j=i;j<n;j++){//checking the number against all others in array
                if(arr[i]==arr[j]){
                    dupli++;
                }
            }
            if(arr[i]==dupli){
                System.out.println(arr[i]);
            }
        }
    }
}

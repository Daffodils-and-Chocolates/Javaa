import java.util.Scanner;

public class Playground2 {
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
    }
}
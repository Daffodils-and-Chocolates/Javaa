package Class.Random;
import java.util.Scanner;

public class ReverseAnArray {
    @SuppressWarnings("all")
    public static void main(String[] args){
        // int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();//size input
        int[] arr=new int[size];
        int[] arrc= new int[size];//copy to this array
        for(int i=0;i<size;i++){//input of array
            arr[i]=sc.nextInt();
        }
        int j=(size-1);     
        // for(int i=0;i<size;i++){
        //         arrc[j]=arr[i];
        //         j--;
        // }
        // for(int i=0;i<size;i++){w
        //     System.out.print(arrc[i]+" ");
        // }
        basic obj= new basic();
        for(int i=0;i<size/2;i++,j--){//swap and change using function
            obj.swap(arr[i],arr[j]);
            System.out.println("outside"+arr[i]);
        }
        System.out.print("\n[");
        for(int i=0;i<size;i++){//display the final array
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    } 
    // static void swap(int a, int b){
    //     int c = a;
    //     a=b;
    //     b=c;
    //     System.out.print("function:"+a+"\t");
}
class basic{
    // public basic(int n){//this is the constructor
    //     System.out.println("this is the constructor and size is "+ n);
    // }
    public static void swap(int a, int b){
        int c = a;
        a=b;
        b=c;
        System.out.print("function:"+a+"\t");
    }
}
package Test.Arrays;
import java.util.*;
public class JavelinThrow {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        for(int i=0;i<n;i++){
            name[i]=sc.next();
            int max=-1;
            for(int j=0;j<6;j++){
                int a = sc.nextInt();
                max=(max>a)?max:a;
            }
            score[i]=max;
        }
        // System.out.println(Arrays.toString(name)+"\n"+Arrays.toString(score));
        // System.out.println(MaxIndex(score));
        while(n-->0){
            int index = MaxIndex(score);
            System.out.println(name[index]);
        }
    }
    static int MaxIndex(int[] arr){
        int max=arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        arr[index]=-1;
        return index;
    } 
}

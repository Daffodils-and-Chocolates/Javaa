package Misc.Arrays;

import java.util.*;
public class StringToIntegerArray {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String forArr = sc.nextLine();
        int[] arr = stringToArray(forArr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] stringToArray(String str){
        String[] string = str.split(" ");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        return arr;
    } 
}
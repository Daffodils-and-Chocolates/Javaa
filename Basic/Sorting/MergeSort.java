package Basic.Sorting;

import java.util.*;

public class MergeSort {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int arr[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        while (k < arr.length) {
            if (i >= left.length)
                arr[k++] = right[j++];
            else if (j >= right.length)
                arr[k++] = left[i++];
            else
                arr[k++] = (left[i] > right[j]) ? right[j++] : left[i++];
        }
    }

    static void mergeSort(int arr[]) {
        // System.out.println(Arrays.toString(arr));
        if (arr.length <= 1)
            return;
        int l = arr.length / 2;
        int r = arr.length - l;
        int[] left = new int[l];
        int[] right = new int[r];
        System.arraycopy(arr, 0, left, 0, l);
        System.arraycopy(arr, l, right, 0, r);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
}
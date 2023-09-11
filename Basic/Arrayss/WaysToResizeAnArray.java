package Basic.Arrayss;
import java.util.*;
public class WaysToResizeAnArray {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int[] arr= {1,2,3,4};
        int[] ogarr = {1,2,3,4};
        System.out.println("\t\tOne\nto resize an array is by making a new array and copying the elements to it and assignning it to the original array");
        System.out.println("Array before ReSize: "+Arrays.toString(arr));

        int[] temp = new int[6];
        int length = arr.length;
        for (int j = 0; j < length; j++) {
          temp[j] = arr[j];
        }
        arr = temp;
        System.out.println("Array after ReSize: "+Arrays.toString(arr));
        System.out.println("\nOutput Explanation: When we do \"b = a\", we are actually assigning a reference to the array. Hence, if we make any change to one array, it would be reflected in other arrays as well because both a and b refer to the same location.");
        System.out.println("\n\n\tUsing System.arraycopy()");
        arr= ogarr;
        System.out.println("Array before ReSize: "+Arrays.toString(arr));
        arr=Arrays.copyOf(arr,7);
        System.out.println("Array after ReSize: "+Arrays.toString(arr));
    }
}

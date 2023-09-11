package Basic.Arrayss;
import java.util.*;

public class ReturnArrayFromFunction {
    @SuppressWarnings ("all")
   public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String str = sc.next();
        char[] arr = reverse(str);
        System.out.println(Arrays.toString(arr));
    }
    public static char[] reverse(String str){
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        return temp.toString().toCharArray();
    }
}

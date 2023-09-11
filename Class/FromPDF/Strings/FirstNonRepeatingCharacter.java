package Class.FromPDF.Strings;
import java.util.*;
public class FirstNonRepeatingCharacter {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String x = sc.nextLine();
        char[] arr = x.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            boolean repeated = false;
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+" "+arr[j]);
                if(arr[i]==arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}

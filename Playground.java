import java.util.Arrays;
import java.util.Scanner;

public class Playground {
	@SuppressWarnings ("resource")
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of Array : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}//array input

		sortFirstDigit(arr);
		System.out.println(Arrays.toString(arr));
		StringBuilder str = new StringBuilder();
		str.append(arr);
		// System.out.println(str);
	}
	public static void sortFirstDigit(int[] arr){
		for(int i=0;i<arr.length;i++){
			int max = i;
			for(int j=i+1;j<arr.length;j++){
				int s=1;
				if(arr[j]==arr[max]) continue;
				while (firstDigit(arr[max], s) ==firstDigit(arr[j], s)) s++;
				max = (firstDigit(arr[max], s)>firstDigit(arr[j], s))?max:j;
			}
			int t = arr[i];
			arr[i] = arr[max];
			arr[max] = t;
		}
	}
	public static int firstDigit(int n,int d){
		int digits = (int)(Math.log10(n))+1;
		int tens = (int)Math.pow(10,digits);
		tens /= (int)Math.pow(10,d);
		if(tens==0) return 0;
		return (n/tens)%10;
	}
}
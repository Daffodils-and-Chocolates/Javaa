import java.util.*;
//circular array
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
		}
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			int currentSum = 0;
			for(int j=i;j<n;j++){//linear sum
				currentSum+=arr[j];
				if(currentSum > maxSum) maxSum = currentSum;
			}
			for(int j=0;j<i;j++){//circularly
				currentSum+=arr[j];
				if(currentSum > maxSum) maxSum = currentSum;
			}
		}
		System.out.println(maxSum);
	}
}
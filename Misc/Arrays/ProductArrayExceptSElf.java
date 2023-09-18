package Misc.Arrays;
import java.util.*;
public class ProductArrayExceptSElf {
    @SuppressWarnings ("resource")
    public static final int MOD = (int)Math.pow(10,9) + 7;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        
        while(c-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();//array input

        int ans[]=getProductArrayExceptSelf(arr);
        // for(int i=0;i<n-1;i++) System.out.print(ans[i]+"_");
        // if(n>0)System.out.println(ans[n-1]);
        // System.out.println(StringUtils.join(ans,"_"));
        }
    }
    public static int[] getProductArrayExceptSelf(int[] arr) {
        int a=arr.length;
        int prod=1;
        int c=0;
        for(int i=0;i<a;i++){
            if(arr[i]!=0) prod*=arr[i];
            else c++;
        }
        Math.min(prod, MOD);
        int[] pro=new int[a];
        for(int i=0;i<a;i++){
            if(c>1)pro[i]= 0;
            else if(c==1 && arr[i]!=0) pro[i] = 0;            
            else pro[i] = (arr[i]==0)? prod : prod/arr[i];
        }
        return pro;
    }
	// public static int[] getProductArrayExceptSelf(int arr[])
	// {
	// 	int n = arr.length;
	// 	if (n==0) return arr;	
    //     else if(n==1) return new int[]{1};
	// 	// Initialize memory to all arrays
	// 	int left[] = new int[n];
	// 	int right[] = new int[n];
	// 	int prod[] = new int[n];

	// 	int i, j;
	// 	left[0] = 1;
	// 	right[n - 1] = 1;

	// 	/* Construct the left array */
	// 	for (i = 1; i < n; i++)
	// 		left[i] = arr[i - 1] * left[i - 1];

	// 	/* Construct the right array */
	// 	for (j = n - 2; j >= 0; j--)
	// 		right[j] = arr[j + 1] * right[j + 1];

	// 	/* Construct the product array using
	// 	left[] and right[] */
	// 	for (i = 0; i < n; i++)
	// 		prod[i] = left[i] * right[i];

	// 	return prod;
	// }
}

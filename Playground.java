import java.util.*;
class Playground {
	/* Function to print product array
	for a given array arr[] of size n */
    @SuppressWarnings ("all")
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while(t-->0){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) arr[i]=sc.nextInt();//array input

			// int[] ans1 = new int[n];
			int[] ans1 = getProductArrayExceptSelf(arr);
            System.out.println(Arrays.toString(ans1));
        }
	}
	public static int[] getProductArrayExceptSelf(int arr[])
	{
		int n = arr.length;
		if (n==0) return arr;	
        else if(n==1) return new int[]{1};
		// Initialize memory to all arrays
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;
		left[0] = 1;
		right[n - 1] = 1;

		/* Construct the left array */
		for (i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];

		/* Construct the right array */
		for (j = n - 2; j >= 0; j--)
			right[j] = arr[j + 1] * right[j + 1];

		/* Construct the product array using
		left[] and right[] */
		for (i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		return prod;
	}

}
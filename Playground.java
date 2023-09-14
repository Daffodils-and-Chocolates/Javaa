import java.util.Scanner;
public class Playground {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        
        while(c-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();//array input

        int ans[]=getProductArrayExceptSelf(arr);
        for(int i=0;i<n-1;i++) System.out.print(ans[i]+"_");
        if(n>0)System.out.println(ans[n-1]);
        // System.out.println(StringUtils.join(ans,"_"));
        }
    }
    public static int[] getProductArrayExceptSelf(int[] arr) {
        int prod=1;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) prod*=arr[i];
            else c++;
        }
        int[] pro=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(c>1)pro[i]= 0;
            else if(c==1 && arr[i]!=0) pro[i] = 0;
            else pro[i] = (arr[i]==0)? prod : prod/arr[i];
        }
        return pro;
    }
}
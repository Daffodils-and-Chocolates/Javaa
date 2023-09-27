import java.util.*;
public class Playground2 {
    public static final long MOD = (int)Math.pow(10,9) + 7;
    @SuppressWarnings ("all")
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
        int a=arr.length;
        long prod=1;
        int c=0;
        for(int i=0;i<a;i++){
            if(arr[i]!=0) prod*=arr[i];
            else c++;
            prod%= MOD;
        }
        int[] pro=new int[a];
        for(int i=0;i<a;i++){
            if(c>1)pro[i]= 0;
            else if(c==1 && arr[i]!=0) pro[i] = 0;            
            else pro[i] = (int) ((arr[i]==0)? prod : ((prod/(long)arr[i])%MOD));
        }
        return pro;
    }
}
package Class.Recursion;
import java.util.*;
public class PermutationByRecursion {
    @SuppressWarnings ("all")
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		int[] count = new int[1];
		gen("",str,count,k);
	}
	static void gen(String prefix, String remaining,int[] count,int k){
		if(remaining.length()==0){
			count[0]++;
			if(count[0]==k){
				System.out.println(prefix);
			}
			return;
		}
		for(int i=0;i<remaining.length();i++){
			// System.out.println("gen("+prefix + remaining.charAt(i)+" , "+remaining.substring(0, i) + remaining.substring(i+1)+")");
			gen(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1) ,count,k);
		}
	}
}
// import java.util.Scanner;

// public class Playground {
// 	@SuppressWarnings ("resource")
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		String str = sc.nextLine();
// 		gen("",str);
// 	}
// 	static void gen(String prefix, String remaining){
// 		if(remaining.length()==0){
// 			System.out.println(prefix);
// 			return;
// 		}
// 		for(int i=0;i<remaining.length();i++){
// 			System.out.println("gen("+prefix + remaining.charAt(i)+" , "+remaining.substring(0, i) + remaining.substring(i+1)+")");
// 			gen(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1) );
// 		}
// 	}
// }
// import java.util.Scanner;

// public class Playground {
// 	@SuppressWarnings ("resource")
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
//         int result = add(5, 7);
//         System.out.println(result);
//     }
// 	public static int add(int a, int b) {
//         return a + b;
//     }
// }
// import java.util.Scanner;

// public class Playground {
// 	@SuppressWarnings ("resource")
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
//     generateSubsets("", "123");
// }

// static void generateSubsets(String prefix, String remaining) {
//     System.out.println(prefix);

//     for (int i = 0; i < remaining.length(); i++) {
//         generateSubsets(prefix + remaining.charAt(i), remaining.substring(i + 1));
//     }
// }
// }
// import java.util.Scanner;

// public class Playground {
// 	@SuppressWarnings ("resource")
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
//         int[] nums = {1, 2, 3};
//         generatePermutations(nums, 0,5);
//     }

//     static void generatePermutations(int[] nums, int index) {
// 		// System.out.println("called & ("+index+")");
//         if (index == nums.length) {
//             for (int num : nums) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//             return;
//         }
//         for (int i = index; i < nums.length; i++) {
// 			// System.out.println("Index :"+i);
//             swap(nums, index, i);
//             generatePermutations(nums, index + 1);
//             swap(nums, index, i); // Backtrack
//         }
//     }

//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }
import java.io.*;
import java.util.*;
class Playground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        tagYouReIt(str,0);
    }
    static void tagYouReIt(String str, int i){
        //base case 
        if(i+1 >= str.length()){
            System.out.println(str);
            return;   
        }
        //else compare index and index+1 and delete
        int notDelete = ((int)str.charAt(i) > (int)str.charAt(i+1))? i : i+1;
        tagYouReIt(str.substring(0,i) + str.charAt(notDelete) + str.substring(i+2),i+1);
    }
}
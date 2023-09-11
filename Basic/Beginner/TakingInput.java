package Basic.Beginner;

import java.util.*;

public class TakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //taking integer inputs
        System.out.println("Input Age : ");
        int age = sc.nextInt();
        System.out.print("age is :");
        System.out.println(age);
        //taking float inputsz
        System.out.println("Input Age : ");
        float agef = sc.nextFloat();
        System.out.print("age in floats is :");
        System.out.println(agef);
        //taking string inputs
        System.out.println("Enter a name");
        String saal = sc.next();
        // sc.nextLine(); adding a nextLine() extra to move cursor position to new place to read next input solves the issue
        System.out.println(saal);
        // taking line as an input
        System.out.println("Enter a line");
        String salt = sc.nextLine();
        String salt1 = sc.nextLine();
        System.out.println(salt1);
        System.out.println("the nextLine() here does not take any input as the cursor is still at the place after taking input from name's next() and hence only reads \n");
        sc.close();
    }
}

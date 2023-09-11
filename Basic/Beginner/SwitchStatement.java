package Basic.Beginner;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        // System.out.println("to be noted that argument value and case values can only be primitive data types in java:no floats, strings,long,or other objects and nothing else other than equality can be tested");
        // switch (test){
        //     case 0:
        //         System.out.println("you typed 0");
        //         break;
        //     case 1:
        //         System.out.println("you typed 1");
        //         break;
        //     default:
        //         System.out.println("only binary allowed");
        // }
        switch(test){
            case 6:
            case 24:
            case 30:
                System.out.println("It's a birthday date");
                break;
            default:
                System.out.println("A normal day");
        }
        sc.close();
    }
    
}

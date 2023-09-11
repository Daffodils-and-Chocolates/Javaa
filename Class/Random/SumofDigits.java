package Class.Random;

import java.util.Scanner;

public class SumofDigits {
    @SuppressWarnings ("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(;n!=0;n/=10){
            sum+=n%10;
        }
        System.out.println("Sum of digits is "+sum);
        sc.close();
    }
}
package Basic.Beginner;
import java.util.Scanner;

public class PrintingInDecimalPoints {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=60, b=7;
        double x =(double) a/b;
        System.out.printf("%,.4f\nThe only time automatic conversion takes place in java is when two types are compatible and size of destination type is larger than source type", x);
        // System.out.println(x);
    }
}
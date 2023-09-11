package Basic.Beginner;
import java.util.Scanner;

public class PrintingInDecimalPoints {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=6, b=7;
        double x = a+b;
        System.out.printf("%,.2f\nThe only time automatic conversion takes place in java is when two types are compatible and size of destination type is larger than source type", x);
    }
}
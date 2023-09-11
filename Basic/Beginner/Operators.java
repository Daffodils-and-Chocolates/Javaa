package Basic.Beginner;

public class Operators {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        System.out.print("a + b = ");
        System.out.println(a+b);
        System.out.print("a - b = ");
        System.out.println(a-b);
        System.out.print("a * b = ");
        System.out.println(a*b);
        System.out.print("a/b = ");
        System.out.println(a/b);
        double c = a/b;
        System.out.println("\neven if you store them in a double the operations still give an integer which is then converted to a double");
        System.out.println(c);
        double aa = 1.0;
        double bb = 2.0;
        double cc = aa/bb;
        System.out.println("\nstoring result after dividing when a and b are both doubles will give ");
        System.out.println(cc);
        double modulo = aa%bb;
        System.out.print("\naa%bb =");
        System.out.println(modulo);
        System.out.println("\nby default dividing two doubles without storing them in a variable gives");
        System.out.println(aa/bb);
        System.out.print("\naa%b = ");
        System.out.println(aa%b);
        System.out.print("a%bb = ");
        System.out.println(a%bb);
        System.out.print("a%b = ");
        System.out.println(a%b);
    }
}

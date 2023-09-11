package Basic.Beginner;

public class TypeCasting {
   public static void main(String[] args) {
    //Implicit Casting
    double price = 100.03;
    double finalPrice= price + 18;
    System.out.println("When an integer is added to and stored in a double the answer is a double "+finalPrice+"\nThis is called Implicit Casting and it can be done in the order\nByte->short->int->long->float->double");
    int p =100;
   //  int fp=p+18.00;
    System.out.println("\nthis [int fp=p+18.00;] gives an error as double can't be stored in an integer\nHappens because size of double is 8 bytes while size of int is 4 bytes.\njava does not have a sizeof() operator");
    //Explicit Casting
    int fp=p+(int)18.99;
    //only works if those types are compatible
    System.out.println("\nwhen casting explicitly:"+fp+"\nIt can be done in the reverse of above order\nDouble->float->long->int->short->byte");
    //make variables immutable
    final float PI = 3.14F;
    System.out.println("\nit is a java convention to name immutable variables in CAPS"+PI+"");
   }
}

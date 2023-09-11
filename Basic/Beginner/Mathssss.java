package Basic.Beginner;

public class Mathssss {
    public static void main(String args[]){
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(1,7));
        //random --prints a random double value between 0 and 1
        System.out.println(Math.random());
        // if we do explicit casting
        System.out.println("\nit will always print 0 if we cast it to an int from double ");
        System.out.println((int)Math.random());
        System.out.println("\nbut we can multiply the double result by 100 and always get a random two digit integer after casting");
        System.out.println((int)(Math.random()*100));
    }
}
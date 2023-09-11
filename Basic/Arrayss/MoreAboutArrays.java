package Basic.Arrayss;
import java.util.*;

public class MoreAboutArrays {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0]=15;
        marks[1]=12;
        marks[2]=17;
        System.out.println("Array won't print in java if you try to print it like a data type"+marks);
        // System.out.print"ln("\nThe System.out.println() method converts the object we passed into a string by calling String.valueOf() . If we look at the String.valueOf() method's implementation, we'll see this:\n---------------------------\npublic static String valueOf(Object obj) {\n\t    return (obj == null) ? \"null\" : obj.toString();\n}\n---------------------------\n\nIf that object's class does not override Object.toString()'s implementation, it will call the Object.toString() method.\n\nObject.toString() returns getClass().getName()+'@'+Integer.toHexString(hashCode()) .");
        System.out.println("\nIn simple terms, it returns: \"class name @ object's hash code\".\nHere [ represents class Array\nI shows data type Integer\n2c7b84de shows hexadecimal of the hash code");
        //can also be initialized like
        String[] subjects = {"English", "Maths" , "Physics" , "Biology"};
        System.out.println("\nArray in Strings");
        System.out.println(Arrays.toString(subjects));
        // So you'll have to print it according to it's index
        System.out.println("\nMarks at 0th index i.e First place are");
        System.out.println(marks[0]);
        //What happens when you try to print without initializing 
        int[] arr = new int[4];
        System.out.println("\nWhile in c/cpp a non-initialized variable gets assigned 0 or garbage value in java it gets assigned null like");
        System.out.println(Arrays.toString(arr));
        //if the array was boolean type though
        boolean[] ar = new boolean[4];
        System.out.println("\nBoolean array when assigned nothing prints ");
        System.out.println(Arrays.toString(ar));
        //FUNCTIONS IN ARRAYS
        //length -- a little different from primitive and non-primitive data types
        System.out.println("\nLength of array is");
        System.out.println(marks.length);
        //sort -- a function under the class Arrays
        System.out.println("\nThe array is:\n"+Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println("The sorted array is now");
        System.out.println(Arrays.toString(marks));
        //2-D Arrays
        int[][] finalMarks= {{9,4,8},{6,8,7}};
        System.out.println("\nFirst student's marks are ");
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks[0][2]);
        System.out.println("\nSecond student's marks are ");
        System.out.println(finalMarks[1][0]);
        System.out.println(finalMarks[1][1]);
        System.out.println(finalMarks[1][2]);
    }
}

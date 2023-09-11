package Basic.Beginner;
import java.util.*;
public class StaticVariables {
    @SuppressWarnings("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Student obj1= new Student();
        Student obj2 = new Student();
        // obj1.school = "hansRaj";
    }
}
class Student{
    public int age;
    public String name;
    public static String school = "Bhavan";
}
package Class.WritingEfficientCode;
import java.util.*;

class Student implements Comparable<Student>{
    int rn;
    String name;
    String branch;

    Student(int rn, String name, String branch){
        this.rn = rn;
        this.name = name;
        this.branch = branch;
    }
    public int compareTo(Student s){
        // return this.rn - s.rn;
        return this.name.compareTo(s.name);
        // return this.branch.compareTo(s.branch);
    }
    public String toString(){
        return "Roll no.: "+ rn + "; Name : " + name + "; Branch : " + branch+"\n";
    }
}

public class UsingComparableNameStudentExampleSort {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        ArrayList<Student> al = new ArrayList<Student>();
        // al.add(2);
        // al.add('a');
        // al.add(true);
        al.add(new Student(1414, "Miss Sharma", "CSE"));
        al.add(new Student(1370, "Simran", "CSE"));
        al.add(new Student(1328, "Simran", "CSE"));
        Collections.sort(al);
        System.out.println(al);
    }
}
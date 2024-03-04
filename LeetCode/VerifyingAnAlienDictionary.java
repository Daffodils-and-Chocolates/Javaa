package LeetCode;
import java.util.*;
//indexOf(i)

public class VerifyingAnAlienDictionary {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        //words array input
        List<String> words = new ArrayList<String>();
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of Array : ");
        for(int i=0;i<n;i++){
            words.add(sc.next());
        }
        //order string input
        System.out.println("String order : ");
        String order = sc.next();
        System.out.println(words);
        System.out.println(isAlienSorted(words,order));
    }
    static public boolean isAlienSorted(List<String> words, String order) {

        System.out.println();
        return false;
    }
}
class orderComparator implements java.util.Comparator<Character>{
    @Override
    public int compare(Char a, Person b) {
        return a.getAge() - b.getAge();
    }
}

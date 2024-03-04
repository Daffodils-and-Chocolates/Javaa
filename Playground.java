import java.util.*;

class DequeDemo {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Deque<Integer> d = new ArrayDeque<Integer>();        
        d.add(10);
        d.addFirst(20);
        d.addFirst(30);

        System.out.println("Deque " + d);
        //add first comes from queue interface but add method comes from difeerent somewhere
    }
}
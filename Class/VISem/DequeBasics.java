package Class.VISem;
import java.util.*;

class DequeDemo {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Deque<Integer> d = new ArrayDeque<Integer>();        
        d.add(10);
        d.addFirst(20);
        d.addFirst(30);
        d.addLast(40);
        d.addLast(50);
        d.addLast(60);
        System.out.println("Deque " + d);
        System.out.println("size "+d.size());
        //add first comes from queue interface but add method comes from difeerent somewhere
        d.removeFirst();
        d.removeLast();
        System.out.println(d);

        d.poll();
        System.out.println(d);

        d.addLast(45);
        d.addLast(46);
        d.forEach((n)->System.out.println(n));

        Integer arr[] = d.stream().toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(arr));

        System.out.println("GetFirst : "+ d.getFirst());
        System.out.println("GetLast : "+ d.getLast());
        System.out.println("d.poll() : "+ d.poll());
        System.out.println("peek : "+ d.peek());
        System.out.println(d);
    }
}
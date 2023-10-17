// import java.util.Scanner;

// public class Playground2 {
//     @SuppressWarnings ("resource")
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println(countNQueens(4));
//     }

//     static int countNQueens(int n) {
//         int[] colPlacements = new int[n];
//         return solveNQueens(colPlacements, 0);
//     }

//     static int solveNQueens(int[] colPlacements, int row) {
//         if (row == colPlacements.length) {
//             return 1;
//         }

//         int count = 0;
//         for (int col = 0; col < colPlacements.length; col++) {
//             colPlacements[row] = col;
//             if (isValid(colPlacements, row)) {
//                 count += solveNQueens(colPlacements, row + 1);
//             }
//         }
//         return count;
//     }

//     static boolean isValid(int[] colPlacements, int row) {
//         for (int i = 0; i < row; i++) {
//             int diff = Math.abs(colPlacements[i] - colPlacements[row]);
//             if (diff == 0 || diff == row - i) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
import java.util.*;

public class Playground2 {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(4);
        list.add(9);
        list.display();
        // list.sort();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        list.display();
    }
}
class LinkedList<T>{
    class node{
        node next;
        T data;
        node(T data){
            this.next = null;
            this.data = data;
        }
    }
    private node head;
    LinkedList(){
        head = null;
    }
    void get(int index){
        if (isEmpty()) return;
        node temp = head;
        boolean flag = false;
        for(int i=0;i<index;i++){
            if(temp.next==null){
                flag = true;
                return;
            }
            temp = temp.next;
        }
        if(flag) return;
        System.out.println(temp.data);
    }
    void add(T data){
        if(isEmpty()) {
            head = new node(data);
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new node(data);
    }
    boolean isEmpty(){
        if(head==null) return true;
        else return false;
    }
    void display(){
        if(isEmpty()) return;
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    void sort(){//bubble sort
        if(isEmpty()) return;
        node current = head;
        while(current!=null){
            node next = current.next;
            while(next!=null){
                if(current.data.compareTo(next.data)){//swap if greater
                    T t = current.data;
                    current.data = next.data;
                    next.data = t;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
}
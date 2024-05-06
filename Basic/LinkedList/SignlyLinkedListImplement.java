package Basic.LinkedList;
import java.util.Scanner;

public class SignlyLinkedListImplement {
    @SuppressWarnings ("all")
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        LinkedList L = new LinkedList();
        L.add(3);
        L.add(1);
        L.add(2);
        L.print();
        System.out.println(L.findFirstOccurence(3));;
    }
}
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    void add(int value){
        if(this.head == null){ 
            head = new Node(value);
            return;
        }
        Node temp = head;
        while(temp.next!=null){temp = temp.next;}
        temp.next = new Node(value);
    }
    void removeFirst(){
        head = head.next;
    }
    void removeLast(){
        Node temp = head;
        while(temp.next.next!=null){ temp = temp.next; }
        temp.next=null;
    }
    // void searchRecursive(Node temp,int value){
    //     if(temp == null) temp = 
    // }
    int findFirstOccurence(int value){
        if(head==null){
            return -1;
        }
        Node temp = head;
        for(int i =0;temp!=null;i++){
            if(temp.value == value) return i;
            temp = temp.next;
        }
        return -1;
    }
    void print(){
        if(this.head==null){ 
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while(temp!=null){ 
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
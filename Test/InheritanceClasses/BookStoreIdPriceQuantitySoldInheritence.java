/*Suppose you are working in a book store that needs to keep track of the total sales. You decide to create a class hierarchy to represent the different types of books
and calculate their tora sales.
To implement this, you create a class called "BookStore" with several instance variables such as "id", "price", and "quantitySold". You then create subclass for Books,
such as "Books", that inherit from the "BookStore" class.
Now you need to calculate the total sales for all books.
Input Format:
First line input consists of number of books N,
Second line input consists of, three space separated values for first book that will be ID(int), Price(double), QuantitySold(int),
Third line input consists of, three space separated values for Second book that will be ID(int), Price(double), QuantitySold(int),
The same process will be repeated until Nth Input.
Output Format:
Output Consists of Double type of value that is Total sale of N books.
Sample input1:
3
101 299.30 3
102 250 10
103 800.49 6
Sample output1:
8200.84
Sample input2:
2
111 125.30 3
112 200 20
Sample output2:
4375.9 */
package Test.InheritanceClasses;
import java.util.Scanner;
public class BookStoreIdPriceQuantitySoldInheritence {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Books obj = new Books(n);
    }
}
class BookStore{
    int Id,quantitySold;
    double price;
    public void get(){
        Id = BookStoreIdPriceQuantitySoldInheritence.sc.nextInt();
        price = BookStoreIdPriceQuantitySoldInheritence.sc.nextDouble();
        quantitySold = BookStoreIdPriceQuantitySoldInheritence.sc.nextInt();
    }
}
class Books extends BookStore{
    public Books(int n){
        double sum =0;
        while(n!=0){
            get();
            sum+=price*quantitySold;
            n--;
        }
        System.out.println(sum);
    }
}
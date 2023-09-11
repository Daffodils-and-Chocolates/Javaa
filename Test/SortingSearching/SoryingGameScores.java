/*Sorting Scores in a Game
You are working on a simple game in Java where players earn scores based on their performance. After each
game, you record the player's score in an array. To display the scores in a user-friendly way, you decide to
implement the bubble sort algorithm to sort the scores in ascending order.
Your task is to implement the bubble sort algorithm to sort the player scores in the array in ascending order. After
sorting, display the sorted scores to the user.
Input Format
The first line of input should contain an integer numberOfScores, which represents the total number of game scores
to be sorted.
The next numberOfScores lines should each contain a single integer representing the individual game scores.
Output Format
The code will display the sorted game scores in ascending order, separated by spaces, after applying the bubble
sort algorithm.
NOTE: Solve the code with steps mentioned above, submitted code will be verified, don't use any pre-
defined methods.
Sample Input
10
1379462850
Sample Output
0123456789
Sample Input
0
12 36 63 78 95 102
Sample Output
12 36 63 78 95 102 */
package Test.SortingSearching;
import java.util.Collection;
import java.util.Scanner;

public class SoryingGameScores {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++){
            scores[i]= sc.nextInt();
        }
        BubbleSort(scores,n);
        display(scores, n);
    }
    static void BubbleSort(int[] arr,int n){
        int u =n;
        for(int i=0;i<n;i++,--u){
            for(int j=0;j<u-1;j++){
                if(arr[j]>arr[j+1]){
                    int t= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
                display(arr, n);
            }
        }
    }
    static void display(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
package Class.Backtracking;
import java.util.*;

public class N_queenProblem {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of board : ");
        int n = sc.nextInt();
        int[][] board =new int[n][n];
        System.out.println(countPossible(board, 0));;
        printBoard(board);
    }
    static void printBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 0) System.out.print(" 0 ");
                else System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean solveNQueen(int[][] board, int col){
        if(col>=board.length) return true;
        for(int i=0;i<board.length;i++){
            if(isSafe(board, col, i)){
                board[col][i]=1;
                if(solveNQueen(board, col+1)) return true;
                board[col][i]= 0;
            }
        }
        return false;
    }
    static int countPossible(int[][] board, int col){
        int count =0;
        for(int i=0;i<board.length;i++){
            if(isSafe(board, col, i)){
                board[col][i]=1;
                if(solveNQueen(board, col + 1)) count++;
                board[col][i] = 0;
            }
        }
        return count;
    }
    static boolean isSafe(int[][] board, int col, int row){
        int i,j;
        //checking all columns above it
        for(i=0 ;i<col ;i++){
            // board[i][row] = i*10 +row;
            if(board[i][row] == 1) return false;
        }
        //checking left diagonal
        for(i=col,j=row ;i>=0 && j>=0;i--, j--){
            // board[i][j] = i*10 +j;
            if(board[i][j] == 1) return false;
        }
        //checking right diagonal
        for(i=col,j=row ;j<board.length && i>=0;i--, j++){
            // board[i][j] = i*10 +j;
            if(board[i][j] == 1) return false;
        }       
        return true;
    }
}
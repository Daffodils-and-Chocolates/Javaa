import java.util.Scanner;

public class Playground2 {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(countNQueens(4));
    }

    static int countNQueens(int n) {
        int[] colPlacements = new int[n];
        return solveNQueens(colPlacements, 0);
    }

    static int solveNQueens(int[] colPlacements, int row) {
        if (row == colPlacements.length) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < colPlacements.length; col++) {
            colPlacements[row] = col;
            if (isValid(colPlacements, row)) {
                count += solveNQueens(colPlacements, row + 1);
            }
        }
        return count;
    }

    static boolean isValid(int[] colPlacements, int row) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(colPlacements[i] - colPlacements[row]);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }
}
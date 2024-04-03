import java.util.*;

class Filling {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of books");
        int n = sc.nextInt();
        System.out.println("Input Books in [thickness,height] per book");
        int[][] books =new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                books[i][j]=sc.nextInt();   
            }
        }
        System.out.println(Arrays.deepToString(books));
        int shelfWidth = sc.nextInt();
        Solution bookcase1 = new Solution();
        System.out.println(bookcase1.minHeightShelves(books, shelfWidth));
        bookcase1.printShelf();
    }
};

class Solution {
    private ArrayList<Integer[]> shelf = new ArrayList<>();
    int n = 0;

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int height = 0;
        if (books.length >= 1) {
            addShelf();
            addBookToCurrentShelf(books, 0);
            for (int i = 1; i < books.length; i++) {
                addBook(books, i, shelfWidth);
            }
            for (int i = 0; i < n; i++) {
                height += shelf.get(i)[1];
            }
        }
        return height;
    }

    private void addBook(int[][] books, int i, int shelfWidth) {
        int widthLeft = shelfWidth - shelf.get(n - 1)[0];
        if (widthLeft < books[i][0]) {
            // no width on current shelf for the book
            addShelf();
            addBookToCurrentShelf(books, i);
            return;
        }
        //there is space for current book on shelf----------------------------------
        if (i + 1 >= books.length || (books[i][0] + books[i + 1][0] <= widthLeft)) {
            // no next book OR next book can also fit on this shelf
            addBookToCurrentShelf(books, i);
            return;
        }
        //next book cannot fit on this shelf-----------------------------------------
        int nextBookHDiff = Math.abs(books[i + 1][1] - books[i][1]);
        int prevBookHDiff = Math.abs(shelf.get(n-1)[1] - books[i][1]);
        // System.out.println("nextBookDiff : "+nextBookHDiff + " prevBookDiff : "+ prevBookHDiff);

        if (nextBookHDiff == prevBookHDiff) {
            // System.out.println("Math.abs(nextBookHDiff) == Math.abs(prevBookHDiff)");
            if(books[i+1][1] > shelf.get(n-1)[1]){
                addShelf();
                addBookToCurrentShelf(books, i);    
                return;           
            }
            else if(books[i+1][1] <= shelf.get(n-1)[1]){
                addBookToCurrentShelf(books, i);
                return;
            }
        } else if (nextBookHDiff < prevBookHDiff)  {
            // System.out.println("nextBookHDiff < prevBookHDiff");
            addShelf();
            addBookToCurrentShelf(books, i);
            return;
        }
        else{
            // System.out.println("else add to current");
            addBookToCurrentShelf(books, i);
            return;
        }
    }

    private void addShelf() {
        shelf.add(new Integer[]{0, 0});
        n++;
    }

    private void addBookToCurrentShelf(int[][] books, int i) {
        shelf.get(n - 1)[0] += books[i][0];
        shelf.get(n - 1)[1] = Math.max(books[i][1], shelf.get(n - 1)[1]);
    }

    void printShelf(){
        for (Integer i[] : shelf) {
            System.out.println(Arrays.toString(i));
        }
    }
}
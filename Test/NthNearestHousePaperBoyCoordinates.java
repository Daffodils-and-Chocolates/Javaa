package Test;
import java.util.*;
public class NthNearestHousePaperBoyCoordinates {
    @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<House> arr = new ArrayList<House>();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n ==1){//take house input
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr.add(new House(a, b));
            }
            else if( n == 2){
                Collections.sort(arr);
                // System.out.println(arr.get(0).distanceFromOrigin);
                System.out.println(arr);
            }
        }
    }
}
class House implements Comparable<House>{
    int x;
    int y;
    int distanceFromOrigin;
    House(int x, int y){
        this.x = x;
        this.y = y;
        // this.distanceFromOrigin = (int)Math.sqrt(x*x + y*y);
        this.distanceFromOrigin = x*x + y*y;
    }
    public int compareTo(House s){
        return this.distanceFromOrigin-(s.distanceFromOrigin);
    }
    public String toString(){
        return x + ","+ y + ":" + distanceFromOrigin;
    }
}
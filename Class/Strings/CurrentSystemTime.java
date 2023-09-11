package Class.Strings;
import java.util.*;
public class CurrentSystemTime {
   public static final Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    //  With StringBuffer
        long startTime = System.currentTimeMillis();
        String str = "Jude";
        StringBuffer sb1 = new StringBuffer(str);
        for(int i=0;i<10000;i++){
            sb1.append("Jude");
        }
       System.out.println("String Buffer : "+(System.currentTimeMillis()-startTime));
    //  With StringBuilder
       startTime = System.currentTimeMillis();
       StringBuilder sb2 = new StringBuilder(str);
       for(int i=0;i<10000;i++){
            sb2.append("Jude");
       }
       System.out.println("String Builder : "+(System.currentTimeMillis()-startTime));
   } 
}

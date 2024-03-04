package Class.VISem;
import java.util.*;

class First extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("i : "+ i);
        }
        System.out.println("Exit from First");
    }
}
class Second extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("j : "+ i);
        }
        System.out.println("Exit from Second");
    }
}
class Third extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("k : "+ i);
        }
        System.out.println("Exit from Third");
    }
}
class Fourth implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("l : "+ i);
        }
        System.out.println("Exit from Fourth");
    }
}
class ThreadTest{
    public static void main(String args[]){
        First f = new First();
        Second s = new Second();
        Third t = new Third();
        Fourth f1 = new Fourth();

        Thread ft = new Thread(f1);
        f.start();
        s.start();
        t.start();
        ft.start();
        //to ensure statement comes at last we can do 
        try{
            Thread.sleep(100);//this will delay the next till the above threads are complete
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        System.out.println("Last Statement");        
        //statement doesnt necesarrily print at the end can be at start, middle, wherever
        
    }
}
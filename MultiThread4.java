//Multi-Threading using Join method
import java.util.*;
 class printgreatsmall{

    public void greater(){
        for(int i=1;i<=5;i++){
            if(i>3){
                System.out.println("Number is greater:"+i);
            }
        }

    }

    public void smaller(){
        for(int i=1;i<=5;i++){
            if(i<3){
                System.out.println("Number is smaller:"+i);
            }
        }
    }

}

class MultiThread4{
    
    public static void main(String args[])throws Exception{

        printgreatsmall gs = new printgreatsmall();

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                gs.greater();
            }
            
        });

        Thread t2 = new Thread(new Runnable() {
           public void run(){
            gs.smaller();
           } 
        });

        t1.start();
        t2.start();

       // t2.suspend(); suspend method is to put the thread from running state to wating state./it can not be run
     
     

        t1.join();
        t2.join();
     System.out.println("Thread is ended");

    }

}

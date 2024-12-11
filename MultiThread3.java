//Multi_Threading using Runnable Interface
import java.util.*;

class Demo implements Runnable{
    public void run(){
        System.out.println("Thread is running..!");
    }
    
}

class MultiThread3{

    public static void main(String args[]){
        System.out.println("Inside the main Thread..!");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

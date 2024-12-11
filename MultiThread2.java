//Multi-Threadding using sleep method

import java.util.*;
 class Demo extends Thread{

    public void run(){

        String name = Thread.currentThread().getName();
        System.out.println("Inside the Runnable Interface...!");
        try{
            for(int i = 1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println("The name of thread is:"+ name +"counter with:"+i);
            }
        }catch(Exception e){

        }
     
    }

}

class MultiThread2{

    public static void main(String args[])throws Exception{

        Demo obj3 = new Demo();//new 
        Demo obj4 = new Demo();

       obj3.setName("new_Thread");
       obj4.setName("Second_Thread");

       obj3.start();
       obj4.start();

       Thread t1 = new Thread(obj3);
       Thread t2 = new Thread(obj4);
      
       obj4.setPriority(4);
       obj3.setPriority(7);
       System.out.println("priority of thread is:"+ obj3.getPriority());
       System.out.println("priority of thread is:"+ obj4.getPriority());

       
       

      //  t1.start();
       // t2.start();
    }
}

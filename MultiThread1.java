//Multi- Threading using Thread class
import java.util.*;

class Demo extends Thread {

    public void fun(){
        System.out.println("Thread is running...!");
    }
    
}
class MultiThread1{
public static void main(String args[]){

    System.out.println("Inside the main Thread...!");

    Demo obj1 = new Demo();
    Demo obj2 = new Demo();

    obj1.start();
    obj2.start();

}
}


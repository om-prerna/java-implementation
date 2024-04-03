package data.structure.problems;
public class MultiThreadDemo extends Thread{

    public void run(){
        try{
            System.out.println(Thread.currentThread().threadId());
            System.out.println(Thread.currentThread().getState());

        }catch (Exception e){
            System.out.println("Exception caught" + e);
        }
    }
    public static void main(String args[]){
        for(int i =0; i < 5; i++) {
            MultiThreadDemo obj = new MultiThreadDemo();
            Thread obj1 = new Thread(new AnotherThread());
            obj.start();
            obj1.start();

        }
    }
}

class AnotherThread implements Runnable{

    public void run(){
        try{
            System.out.println(Thread.currentThread().threadId());

        }catch (Exception e){
            System.out.println("Exception caught" + e);
        }
    }
}

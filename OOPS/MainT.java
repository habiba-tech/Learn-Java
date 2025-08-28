class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Running:"+ Thread.currentThread().getName());
    }
}
public class MainT{
    public static void main(String[] args) {
        MyThread t1 =  new MyThread(); //Thread 1
        MyThread t2 =  new MyThread(); //Thread 2
        t1.start();
        t2.start();
    }
}

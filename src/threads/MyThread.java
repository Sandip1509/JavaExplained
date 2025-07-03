package threads;

public class MyThread extends Thread{
    public static void main(String[] args) {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

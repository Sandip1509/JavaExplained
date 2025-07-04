package threads.thread_creation;

public class UsingThreadClass extends Thread{
    public static void main(String[] args) {
        UsingThreadClass th = new UsingThreadClass();
        th.start();
    }
    public void run() {
        System.out.println("Thread is running via Thread class...");
    }
}

package threads.thread_creation;

public class UsingRunnableInterface implements Runnable{

    public static void main(String[] args) {
        UsingRunnableInterface runnable = new UsingRunnableInterface();
        Thread th = new Thread(runnable);
        th.start();
    }
    @Override
    public void run() {
        System.out.println("Thread is running via Runnable interface...");
    }
}

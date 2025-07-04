package threads;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Thread is Started: " + Thread.currentThread().getName());
        System.out.println("HelloWorld..!!");
        System.out.println("Thread is completed: " + Thread.currentThread().getName());
    }
}

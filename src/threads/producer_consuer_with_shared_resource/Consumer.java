package threads.producer_consuer_with_shared_resource;

public class Consumer extends Thread{
    private final SharedBuffer buffer;

    Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int count = 0;
        while(count<10) {
            try {
                buffer.consume();
                count++;
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

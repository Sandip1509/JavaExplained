package threads.producer_consuer_with_shared_resource;

public class Producer extends Thread{
    private final SharedBuffer buffer;
    Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        while(value<10) {
            try {
                buffer.produce(value++);
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

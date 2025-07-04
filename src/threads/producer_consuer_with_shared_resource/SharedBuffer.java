package threads.producer_consuer_with_shared_resource;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while(buffer.size() == capacity){
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: "+ value);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while(buffer.isEmpty()){
            wait();
        }
        int value = buffer.poll();
        System.out.println("Consumed: "+value);
        notifyAll();
    }

}

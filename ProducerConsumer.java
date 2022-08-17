import java.util.LinkedList;
import java.util.List;
 
class Producer implements Runnable {
 
    private List<Integer> sharedQueue;
    private int maxSize=5;//maximum number of products which sharedQueue can hold at a time.
 
    public Producer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {  //produce 10 products.
         try {
             produce(i);
         } catch (InterruptedException e) {  e.printStackTrace();   }
        }
}
 
    private void produce(int i) throws InterruptedException {
    
       synchronized (sharedQueue) {
           //if sharedQuey is full wait until consumer consumes.
           while (sharedQueue.size() == maxSize) {
             System.out.println("Queue is full, producerThread is waiting for "
                     + "consumerThread to consume, sharedQueue's size= "+maxSize);
             sharedQueue.wait();
         }
        }
       
         synchronized (sharedQueue) {  
           System.out.println("Produced : " + i);
           sharedQueue.add(i);
         Thread.sleep((long)(Math.random() * 1000));
         sharedQueue.notifyAll();
        }
    }
}
 
class Consumer implements Runnable {
    private List<Integer> sharedQueue;
    public Consumer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
   
    @Override
    public void run() {
        while (true) {
         try {
             consume();
             Thread.sleep(1000);
         } catch (InterruptedException e) {  e.printStackTrace();   }
        }
    }
 
    private void consume() throws InterruptedException {
      
       synchronized (sharedQueue) {
           //if sharedQuey is empty wait until producer produces.
           while (sharedQueue.size() == 0) {
                  System.out.println("Queue is empty, consumerThread is waiting for "
                               + "producerThread to produce, sharedQueue's size= 0");
             sharedQueue.wait();
         }
       }
       
 
       synchronized (sharedQueue) {
           Thread.sleep((long)(Math.random() * 2000));
         System.out.println("CONSUMED : "+ sharedQueue.remove(0));
         sharedQueue.notify();
        }
    }
   
}
 
public class ProducerConsumer{
 
    public static void main(String args[]) {
       List<Integer> sharedQueue = new LinkedList<Integer>(); //Creating shared object
      
       Producer producer=new Producer(sharedQueue);
       Consumer consumer=new Consumer(sharedQueue);
      
        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
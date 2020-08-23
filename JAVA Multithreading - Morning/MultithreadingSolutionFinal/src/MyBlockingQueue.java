import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class MyBlockingQueue {
    Queue<Integer> bqQueue = new LinkedList<>();
    int bqCapacity;

    MyBlockingQueue(int bqCapacity){
        this.bqCapacity = bqCapacity;
    }

    public void put(int index, int num) throws InterruptedException {
        while(true){
            synchronized (this) {
                if (bqQueue.size() == this.bqCapacity){
                    System.out.println("    Queue is full. No task present is already taken by the consumer");
                    while (bqQueue.size() == this.bqCapacity){
                        wait();
                    }
                }
                System.out.println("P" + index +  " PUT " + num);
                bqQueue.add(num++);
                notifyAll();
                Thread.sleep(500);
            }
        }
    }

    public void take(int index) throws InterruptedException {
        while(true){
            synchronized (this) {
                if (bqQueue.size() == 0){
                    System.out.println("    Queue is empty. There is no task present in the queue.");
                    while (bqQueue.size() == 0){
                        wait();
                    }
                }
                System.out.println("C" + index + " TAKE " + bqQueue.poll());
                notifyAll();
                Thread.sleep(500);
            }
        }
    }
}

class Consumer implements Runnable {
    int index;
    MyBlockingQueue bq;

    Consumer(int index, MyBlockingQueue bq){
        this.index = index;
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            bq.take(this.index);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


class Producer implements Runnable {
    int index;
    MyBlockingQueue bq;
    Random rand = new Random();

    Producer(int index, MyBlockingQueue bq){
        this.index = index;
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            bq.put(this.index, this.rand.nextInt(1000));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

import java.util.Scanner;

public class BlockingQueueMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bqCapacity, numProducers, numConsumers;

        System.out.println("Capacity?  ");
        bqCapacity = s.nextInt();
        MyBlockingQueue myBQ = new MyBlockingQueue(bqCapacity);

        System.out.println("Number of producer threads? ");
        numProducers = s.nextInt();
        System.out.println("Number of consumer threads? ");
        numConsumers = s.nextInt();

        Thread[] prodThreads = new Thread[numProducers];
        Thread[] consThreads = new Thread[numConsumers];

        System.out.println("Starting experiment...");
        runExperiment(prodThreads, consThreads, numProducers, numConsumers, myBQ);
    }

    public static void runExperiment(Thread[] prodThreads, Thread[] consThreads, int numProducers,
                                     int numConsumers, MyBlockingQueue myQueue){
        System.out.println("Creating " + numProducers + " producer threads...");
        for (int i = 0; i < numProducers; i++){
            prodThreads[i] = new Thread(new Producer(i, myQueue));
        }
        System.out.println("Creating " + numConsumers + " consumer threads...");
        for (int i = 0; i < numConsumers; i++){
            consThreads[i] = new Thread(new Consumer(i, myQueue));
        }
        System.out.println("Starting all producers...");

        for (int i = 0; i < numProducers; i++){
            prodThreads[i].start();
        }
        System.out.println("Starting all consumers...");
        for (int i = 0; i < numConsumers; i++){
            consThreads[i].start();
        }

        for (Thread p : prodThreads){
            try {
                p.join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (Thread c : consThreads){
            try {
                c.join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

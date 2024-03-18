class Counterr {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class ThreadSafeConcept {
    public static void main(String[] args) {

        Counterr c = new Counterr();

        Runnable o1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
                Thread.yield();
            }

        };
        Runnable o2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
                Thread.yield();
            }

        };

        // Start a thread using the start() method
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.count);

    }
}

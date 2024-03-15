class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Helllo extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Helllo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadConcept {
    public static void main(String[] args) {
        Hi ob1 = new Hi();
        Helllo ob2 = new Helllo();

        System.out.println(ob1.getPriority());
        ob2.setPriority(Thread.MAX_PRIORITY);

        ob1.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ob2.start();
    }
}

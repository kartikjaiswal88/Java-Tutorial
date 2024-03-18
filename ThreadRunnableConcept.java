// class Hiii implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Hellloo implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Helllo");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class ThreadRunnableConcept {
    public static void main(String[] args) {
        Runnable ob1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Runnable ob2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Helllo");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        // Start a thread using the start() method
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
        /*
         * try {
         * t1.join();
         * t2.join();
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * }
         */
    }
}

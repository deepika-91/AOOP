package module1D;
public class Main {

    public static void main(String[] args) {
        // Runnable task that logs a message with the current thread's name
        Runnable logTask = () -> {
            Logger logger = Logger.getInstance();
            logger.log(Thread.currentThread().getName() + " started.");
        };

        // Create multiple threads to test the logging service in a multithreaded environment
        Thread thread1 = new Thread(logTask);
        Thread thread2 = new Thread(logTask);
        Thread thread3 = new Thread(logTask);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Log a message from the main thread
        Logger.getInstance().log("Main thread completed.");
    }
}

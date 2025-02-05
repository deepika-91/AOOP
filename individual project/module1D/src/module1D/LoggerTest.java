package module1D;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoggerTest {

    @Test
    @DisplayName("Test Singleton Instance - Only one instance should be created")
    public void testSingletonInstance() {
        // Get two instances of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify that both instances are the same
        assertSame(logger1, logger2, "Logger instances should be the same.");
    }

    @Test
    @DisplayName("Test Logger is thread-safe and singleton across multiple threads")
    public void testLoggerInMultithreadedEnvironment() throws InterruptedException {
        // Executor service to run multiple threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                Logger logger = Logger.getInstance();
                logger.log("Log from thread " + Thread.currentThread().getName());
                latch.countDown();  // Decrement the latch
            });
        }

        // Wait for all threads to finish
        latch.await();

        // After all threads have executed, we check that only one instance was used
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Assert that both references are the same instance
        assertSame(logger1, logger2, "Logger instances should be the same after multiple thread execution.");

        executorService.shutdown();
    }
    
}

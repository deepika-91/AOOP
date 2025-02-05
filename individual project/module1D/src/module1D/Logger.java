package module1D;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    private static final String LOG_FILE = "app.log";

    private Logger() {
        // private constructor to prevent instantiation
    }

    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write("[" + timestamp + "] " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

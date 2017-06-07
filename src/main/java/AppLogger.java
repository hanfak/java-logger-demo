public class AppLogger implements Logger {

    private final org.slf4j.Logger logger;

    public AppLogger(org.slf4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String message) {
        logger.info(message);
    }

    @Override
    public void warn(String message) {

    }

    @Override
    public void error(String message) {

    }
}

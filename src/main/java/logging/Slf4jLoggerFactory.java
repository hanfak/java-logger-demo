package logging;

public class Slf4jLoggerFactory implements LoggerFactory {
    @Override
    public Logger logger(LoggingCategory loggingCategory) {
        return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(loggingCategory.category));
    }
}

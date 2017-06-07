package logging;

public interface LoggerFactory {
    Logger logger(LoggingCategory loggingCategory);
}

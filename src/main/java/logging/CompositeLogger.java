package logging;

import java.util.Arrays;
import java.util.List;

public class CompositeLogger implements Logger {
    private final List<Logger> loggers;

    public CompositeLogger(Logger... loggers) {
        this.loggers = Arrays.asList(loggers);
    }

    @Override
    public void info(String message) {
        loggers.forEach(logger -> logger.info(message));
    }

    @Override
    public void warn(String message) {
        loggers.forEach(logger -> logger.warn(message));
    }

    @Override
    public void warn(String message, Throwable throwable) {
        loggers.forEach(logger -> logger.warn(message, throwable));
    }

    @Override
    public void error(String message) {
        loggers.forEach(logger -> logger.error(message));
    }

    @Override
    public void error(String message, Throwable throwable) {
        loggers.forEach(logger -> logger.error(message, throwable));
    }

    @Override
    public void debug(String message) {
        loggers.forEach(logger -> logger.debug(message));
    }
}

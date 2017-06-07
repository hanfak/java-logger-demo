package logging;

import org.apache.log4j.spi.LocationInfo;

import static java.lang.String.format;

public class ContextAwareLogger implements Logger {
    private final Logger logger;

    public ContextAwareLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String message) {
        logger.info(withCallerInfo(message));
    }

    @Override
    public void warn(String message) {
        logger.warn(withCallerInfo(message));
    }

    @Override
    public void warn(String message, Throwable exception) {
        logger.warn(withCallerInfo(message), exception);
    }

    @Override
    public void error(String message) {
        logger.error(withCallerInfo(message));
    }

    @Override
    public void error(String message, Throwable exception) {
        logger.error(withCallerInfo(message), exception);
    }

    @Override
    public void debug(String message) {
        logger.debug(withCallerInfo(message));
    }

    private String withCallerInfo(String message) {
        LocationInfo callerLocationInfo = new LocationInfo(new Throwable(), ContextAwareLogger.class.getName());
        return format("(%s: %s) %s", callerLocationInfo.getFileName(), callerLocationInfo.getLineNumber(), message);
    }
}

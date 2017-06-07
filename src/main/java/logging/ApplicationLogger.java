package logging;

import static logging.LoggingCategory.APPLICATION;

public class ApplicationLogger extends ContextAwareLogger {

    public ApplicationLogger(LoggerFactory loggerFactory) {
        super(loggerFactory.logger(APPLICATION));
    }
}

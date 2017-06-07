package logging;

import org.apache.log4j.PropertyConfigurator;

import static java.lang.String.format;

public class LoggingBootstrapper {
    public static final String PRODUCTION_LOG4J_PROPERTIES_FILE = APPLICATION_NAME + ".log4j.properties";

    private static Logger startupLogger() {
        return new ContextAwareLogger(new CompositeLogger(new SystemOutLogger(), new ApplicationLogger(new Slf4jLoggerFactory())));
    }

    public static void bootstrapLogging(String log4jPropertiesFile) {
        PropertyConfigurator.configure(LoggingBootstrapper.class.getClassLoader().getResourceAsStream(log4jPropertiesFile));
        startupLogger().info(format("Logging to directory '%s'", logDirectory()));
    }

    public static String logDirectory() {
        return new AppRuntimeInformation().logDirectory();
    }
}

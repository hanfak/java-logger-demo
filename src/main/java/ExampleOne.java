import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleOne {
    static Logger LOGGER = LoggerFactory.getLogger(ExampleOne.class);

    private final Logger logger;

    public ExampleOne(Logger logger) {
        this.logger = logger;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                LOGGER.info("Hello {} {}", i, 99);
//                LOGGER.warn("warning Hello {} {}", i, 99);
//                LOGGER.error("error Hello {} {}", i, 99);
//            } else {
//                LOGGER.debug("I am on index {}", i);
//            }
        new ExampleOne(new AppLogger());
    }


}

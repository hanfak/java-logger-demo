package logging;

public class SystemOutLogger implements Logger {
    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public void warn(String message) {
        System.err.println(message);
    }

    @Override
    public void warn(String message, Throwable throwable) {
        System.err.println(message);
        throwable.printStackTrace();
    }

    @Override
    public void error(String message) {
        System.err.println(message);
    }

    @Override
    public void error(String message, Throwable throwable) {
        System.err.println(message);
        throwable.printStackTrace();
    }

    @Override
    public void debug(String message) {
        System.out.println(message);
    }
}

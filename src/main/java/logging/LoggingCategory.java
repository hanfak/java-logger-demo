package logging;

public enum LoggingCategory {
    APPLICATION("application");

    public final String category;

    LoggingCategory(String category) {
        this.category = category;
    }
}

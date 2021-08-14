package hillel.logger;

public class Logger {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public void debug(String text){
        System.out.println((ANSI_GREEN + "DEBUG: ") + ANSI_WHITE + text );
    }
    public void error(String text){
        System.out.println((ANSI_RED + "ERROR: ") + ANSI_WHITE + text);
    }
    public void warn(String text){
        System.out.println((ANSI_BLUE + "WARNING: ") + ANSI_WHITE + text);
    }
    public void info(String text){
        System.out.println((ANSI_PURPLE + "INFO: ") + ANSI_WHITE + text);
    }
}

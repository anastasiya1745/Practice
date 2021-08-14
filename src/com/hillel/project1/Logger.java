package com.hillel.project1;

public class Logger {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";

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

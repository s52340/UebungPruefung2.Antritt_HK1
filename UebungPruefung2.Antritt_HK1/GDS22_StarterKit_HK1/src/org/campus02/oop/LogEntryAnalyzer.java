package org.campus02.oop;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class LogEntryAnalyzer {
    private ArrayList<LogEntry> logEntries = new ArrayList<>();

    public LogEntryAnalyzer() {
       // this.logEntries = logEntries;
    }

    public void setLogEntries(ArrayList<LogEntry> logEntries) {
        this.logEntries = logEntries;
    }

    /**
     * Getter selbst für untere Klassen hinzugefügt
     */

    public ArrayList<LogEntry> getLogEntries() {
        return logEntries;
    }

    public abstract void  analyze();


}

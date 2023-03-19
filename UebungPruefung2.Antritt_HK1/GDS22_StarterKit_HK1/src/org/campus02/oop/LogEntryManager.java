package org.campus02.oop;

import java.util.ArrayList;

public class LogEntryManager {
    private ArrayList<LogEntry> logEntries = new ArrayList<>();

    public LogEntryManager() {
        //this.logEntries = logEntries;
    }


    public void add(LogEntry x){
        logEntries.add(x);
    }

    public ArrayList<LogEntry> getLogEntries() {
        return this.logEntries;
    }
}

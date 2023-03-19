package org.campus02.oop;

import java.util.ArrayList;

public class MaxLogEntryAnalyzer extends LogEntryAnalyzer {
    private LogEntry logEntry;

    public MaxLogEntryAnalyzer() {
        //this.logEntry = logEntry;
    }

    @Override
    public void analyze() {
        int amount = 0;
        ArrayList<LogEntry> logEs = getLogEntries();
        for (LogEntry logE : logEs) {
            if (logE.getLogEntryID() > amount){
                amount = logE.getLogEntryID();
                logEntry = logE;
            }
        }
    }

    public LogEntry getLogEntry() {
        return logEntry;
    }
}

package org.campus02.oop;

import java.util.ArrayList;

public class MaxLogEntryAnalyzer extends LogEntryAnalyzer {
    private LogEntry logEntry = null; //zwingend mit null initialisieren??

    public MaxLogEntryAnalyzer() {
        //this.logEntry = logEntry;
    }

    @Override
    public void analyze() {            //Falsch?
        int amount = 0;
        ArrayList<LogEntry> logEs = getLogEntries();
        for (LogEntry logE : logEs) {
            if (logE.getLogEntryID() > amount){
                amount = logE.getLogEntryID();
                logEntry = logE;
            }
        }
    }

  /*  @Override                       //Markus:
    public void analyze() {
        LogEntry maxIdEntry = null;
        for (LogEntry entry : super.getLogEntries()) {
            if (maxIdEntry == null || entry.getLogEntryID() > maxIdEntry.getLogEntryID()) {
                maxIdEntry = entry;
            }
        }
        logEntry = maxIdEntry;
    }*/



    public LogEntry getLogEntry() {
        return logEntry;
    }
}

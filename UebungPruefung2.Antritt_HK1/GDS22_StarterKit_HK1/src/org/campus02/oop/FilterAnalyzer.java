package org.campus02.oop;

import java.util.ArrayList;

public class FilterAnalyzer extends LogEntryAnalyzer {
    private ArrayList<LogEntry> result = new ArrayList<>();
    private String logLevel;

    public FilterAnalyzer(String logLevel) {
        this.result = result;
        this.logLevel = logLevel;
    }

    public ArrayList<LogEntry> getResult() {
        return result;
    }

    public String getLogLevel() {
        return logLevel;
    }

    @Override
    public void analyze() {
        ArrayList<LogEntry> logEs = getLogEntries();
        for (LogEntry logE : logEs) {
            if (logE.getLogLevel().equals(logLevel)){
                result.add(logE);
            }
        }
    }
}

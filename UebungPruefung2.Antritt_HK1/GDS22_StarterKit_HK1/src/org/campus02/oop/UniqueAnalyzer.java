package org.campus02.oop;

import java.util.ArrayList;

public class UniqueAnalyzer extends LogEntryAnalyzer{
    private ArrayList<String> result = new ArrayList<>();

    public UniqueAnalyzer() {
        //this.result = result;
    }

    @Override
    public void analyze() {
    ArrayList<LogEntry> logEn = super.getLogEntries();
        for (LogEntry logE : logEn) {
           String message = logE.getMessage();
          if (!result.contains(message)){        //methode richtig verstanden??
              result.add(message);
          }

        }
    }

    public ArrayList<String> getResult() {
        return result;
    }
}

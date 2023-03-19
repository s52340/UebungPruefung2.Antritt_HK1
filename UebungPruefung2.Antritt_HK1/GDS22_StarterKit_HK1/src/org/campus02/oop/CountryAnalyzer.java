package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryAnalyzer extends LogEntryAnalyzer{
    private HashMap<String, Integer> result = new HashMap<>();

    public CountryAnalyzer() {
        // this.result = result;   //Weglöschen??
    }

    @Override
    public void analyze() {
        int counter = 1;
        ArrayList<LogEntry> logEs = getLogEntries();
        for (LogEntry logE : logEs) {
            if (result.containsKey(logE.getCountryID())){
                counter++;
                result.put(logE.getCountryID(), counter);
            }
            else {
                result.put(logE.getCountryID(),counter);
            }
        }

    }

    //Speichern in HashMap result die Anzahl der LogEntries je Land
    //"AT", "DE", "CH", "SI", "PL", "GB"

    public HashMap<String, Integer> getResult() {
        return result;
    }
}

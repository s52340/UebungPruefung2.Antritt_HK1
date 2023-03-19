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
        result.clear();                         //warum clear wenn erst neu erstellt?
        ArrayList<LogEntry> logEs = super.getLogEntries();
        for (LogEntry logE : logEs) {
            if (result.containsKey(logE.getCountryID())){

                result.put(logE.getCountryID(), result.get(logE.getCountryID()) + 1);
            }
            else {
                result.put(logE.getCountryID(), 1);
            }
        }

    }

    //Speichern in HashMap result die Anzahl der LogEntries je Land
    //"AT", "DE", "CH", "SI", "PL", "GB"

    public HashMap<String, Integer> getResult() {
        return result;
    }
}

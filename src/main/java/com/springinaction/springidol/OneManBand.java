package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import java.util.Properties;

public class OneManBand implements Performer {

    private Properties instruments;


    public OneManBand() {
    }


    @Override
    public void perform() throws PerformanceException {

        for (Object key : instruments.keySet()) {
            System.out.print(key + ": ");
            System.out.println(instruments.get(key));
        }
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}

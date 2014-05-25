package com.springinaction.springidol;


import com.springinaction.springidol.exceptions.PerformanceException;


/**
 * Created by Grigoriy Alexeev on 20 May 2014.
 */
public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;


    public Instrumentalist() {

    }


    @Override
    public void perform() throws PerformanceException {

        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}

package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

import static javax.sound.midi.MidiSystem.getSynthesizer;

/**
 * Created by Grigoriy Alexeev on 20 May 2014.
 */
public class Instrumentalist implements Performer {

    private String song;
    private static Synthesizer synthesizer;
//    private static MidiChannel midiChannel;
    private static MidiChannel[] midiChannels;

    static {

        try {
            synthesizer = getSynthesizer();
            synthesizer.open();
            midiChannels = synthesizer.getChannels();
            Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
            synthesizer.loadInstrument(instruments[90]);
//            midiChannel = midiChannels[5];

        } catch (MidiUnavailableException e) {
            e.printStackTrace();

            if (synthesizer != null) {
                synthesizer.close();
            }
        }
    }


    public Instrumentalist() {

    }


    @Override
    public void perform() throws PerformanceException {

        System.out.println("Playing " + song + " : ");
        midiChannels[5].noteOn(60, 600);
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void destroy() {
        synthesizer.close();
    }
}

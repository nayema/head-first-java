package com.nayema;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class Main {
    public static void main(String[] args) {
        Main mt = new Main();
        mt.play();
    }

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer " + sequencer);
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
            ex.printStackTrace();
        }
    }
}

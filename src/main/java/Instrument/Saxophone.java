package Instrument;

import Interfaces.IPlay;

public class Saxophone extends Instrument implements IPlay {
    private int numOfValves;

    public Saxophone(String colour, int numOfValves) {
        super("Brass", colour, "brass");
        this.numOfValves = numOfValves;
    }

    public String playInstrument() {
        return "Brass sounds!!";
    }

    public int getNumOfValves() {
        return numOfValves;
    }
}

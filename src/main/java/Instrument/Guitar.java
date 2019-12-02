package Instrument;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay {
    private String string;
    private String colour;
    private int strings;
    private String category;

    public Guitar(String colour, String category) {
        super("string", colour, "wood");
        this.colour = colour;
        this.category = category;
        this.strings = 6;
    }

    public String playInstrument() {
        return "Twang!!";
    }

    public String getCategory() {
        return category;
    }

    public int getNumStrings() {
        return strings;
    }
}

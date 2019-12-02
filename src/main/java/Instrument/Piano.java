package Instrument;

import Interfaces.IPlay;

public class Piano extends Instrument implements IPlay {
    private String colour;
    private String category;

    public Piano(String colour, String category) {
        super("string", colour, "wood");
        this.colour = colour;
        this.category = category;
    }

    public String playInstrument() {
        return "Piano sounds!";
    }

    public String getCategory() {
        return category;
    }


}

package me.jeyzer.gayngas;

import me.jeyzer.gayngas.struct.Brain;
import me.jeyzer.gayngas.struct.Dick;
import me.jeyzer.gayngas.struct.Mouth;
import me.jeyzer.gayngas.struct.Orientation;

public class BritishAndre extends PersonaNonUmana {

    public BritishAndre() {
        super(new Dick(40, false), new Brain(false, -1), new Mouth(true, false), Orientation.ASEXUAL);
    }
}

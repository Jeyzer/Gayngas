package me.jeyzer.gayngas;

import me.jeyzer.gayngas.struct.Brain;
import me.jeyzer.gayngas.struct.Dick;
import me.jeyzer.gayngas.struct.Mouth;
import me.jeyzer.gayngas.struct.Orientation;

public class Jeyzer extends PersonaNonUmana {

    public Jeyzer() {
        super(new Dick(Double.MAX_VALUE, false), new Brain(false, Integer.MIN_VALUE), new Mouth(false, false), Orientation.AEYES);
    }
}

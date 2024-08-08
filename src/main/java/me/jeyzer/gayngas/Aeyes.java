package me.jeyzer.gayngas;

import me.jeyzer.gayngas.struct.Brain;
import me.jeyzer.gayngas.struct.Dick;
import me.jeyzer.gayngas.struct.Mouth;
import me.jeyzer.gayngas.struct.Orientation;

public class Aeyes extends PersonaNonUmana {

    public Aeyes() {
        super(new Dick(Double.MAX_VALUE, true), new Brain(false, Integer.MAX_VALUE), new Mouth(true, true), Orientation.LESBIAN);
    }

}

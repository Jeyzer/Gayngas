package me.jeyzer.gayngas;

import me.jeyzer.gayngas.struct.Brain;
import me.jeyzer.gayngas.struct.Dick;
import me.jeyzer.gayngas.struct.Mouth;
import me.jeyzer.gayngas.struct.Orientation;

public class Reach extends PersonaNonUmana {

    public Reach() {
        super(new Dick(-Integer.MAX_VALUE, true), new Brain(false, -Integer.MAX_VALUE), new Mouth(false, false), Orientation.STRAIGHT);
    }
}

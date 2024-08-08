package me.jeyzer.gayngas;

import me.jeyzer.gayngas.struct.Brain;
import me.jeyzer.gayngas.struct.Dick;
import me.jeyzer.gayngas.struct.Mouth;
import me.jeyzer.gayngas.struct.Orientation;

public class Dennis extends PersonaNonUmana {

    public Dennis() {
        super(new Dick(0.1d, true), new Brain(true, 120), new Mouth(true, false), Orientation.GAY);
    }
}

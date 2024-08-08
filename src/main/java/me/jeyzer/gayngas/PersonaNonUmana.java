package me.jeyzer.gayngas;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.jeyzer.gayngas.struct.Brain;
import me.jeyzer.gayngas.struct.Dick;
import me.jeyzer.gayngas.struct.Mouth;
import me.jeyzer.gayngas.struct.Orientation;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public abstract class PersonaNonUmana {

    private final Dick dick;
    private final Brain brain;
    private final Mouth mouth;
    private final Orientation orientation;

}

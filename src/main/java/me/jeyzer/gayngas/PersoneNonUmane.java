package me.jeyzer.gayngas;

import java.util.*;

public class PersoneNonUmane {

    private final Set<PersonaNonUmana> nonUmani = new HashSet<>();

    public void add(PersonaNonUmana... personaNonUmane) {
        this.nonUmani.addAll(Arrays.asList(personaNonUmane));
    }

    public void flush(PersonaNonUmana personaNonUmana) {
        nonUmani.remove(personaNonUmana);
    }


    public Collection<PersonaNonUmana> collect() {
        return List.copyOf(nonUmani);
    }

}


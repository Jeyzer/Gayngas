package me.jeyzer;

import me.jeyzer.gayngas.*;
import me.jeyzer.gayngas.struct.Mouth;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersoneNonUmane gangas = new PersoneNonUmane();

        gangas.add(new BritishAndre(), new Dennis(), new Jeyzer(), new Aeyes(), new Reach());

        gangas.collect().forEach(persona -> {
            Mouth mouth = persona.getMouth();

            System.out.println("==============");
            System.out.println("Nome: " + persona.getClass().getSimpleName());
            System.out.println("Orientamento Sessuale: " + persona.getOrientation().name());
            System.out.println("Analfabeta: " + mouth.isAnalfabeta());
            System.out.println("Muto: " + mouth.isShut());
            System.out.println("IQ: " + persona.getBrain().getIq());
            System.out.println("Lunghezza del manganello: " + persona.getDick().getInches());
            System.out.println("==============");
        });
    }

    private static void a(List<String> list) {
        list.forEach(System.out::println);
        int index = list.indexOf("321");
        list.remove(index);
        list.add(10, "321");
    }
}
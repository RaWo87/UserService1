package sda;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    // kolejnosc nieokresloma
    // add, addALL cala kolekcja
    // contains

    public static void main(String[] args) {
//        Countries kraje = new Countries();
//        kraje.addCountry("polska");
//        kraje.addCountry("polska2");
//        kraje.addCountry("polska3");
//        kraje.addCountry("polska");
//        kraje.addCountry("polska");
//
//        kraje.removeCountry("polska");
//        kraje.modifyCountry("polska98","polskaB");
//
//        System.out.println(kraje.zbiorKrajow);

        Countries2 setKrajow = new Countries2();
        setKrajow.addCountry("polandia","warsza",2);
        setKrajow.addCountry("niemlandia","berlin",32);
        setKrajow.addCountry("roslandia","moskwa",2123);
        setKrajow.addCountry("finlandia","helsinki",9999);
        setKrajow.addCountry("portugalia","lizbona", 8);

        System.out.println(setKrajow.getALLCountries());
        System.out.println(setKrajow.getByName("polandia"));


    }
}


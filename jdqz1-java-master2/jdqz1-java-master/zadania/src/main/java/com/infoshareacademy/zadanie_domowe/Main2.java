package com.infoshareacademy.zadanie_domowe;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        Uczen uczen = new Uczen();
        uczen.setImie("Ania");
        uczen.setNazwisko("Kowalska");
        uczen.ustawOceny();

        Uczen uczen2 = new Uczen();
        uczen2.setImie("Jan");
        uczen2.setNazwisko("Kowalski");
        uczen2.ustawOceny();

        List<Uczen> uczniowie = new ArrayList<Uczen>();
        uczniowie.add(uczen);
        uczniowie.add(uczen2);

        for (Uczen u : uczniowie){
            System.out.println("uczen 1 srednia = " + u.srednia());
            System.out.println("uczen 1 najwyzsza = " + u.najwyzsza());
            System.out.println("uczen 1 najnizsza = " + u.najnizsza());
        }

        System.out.println("uczen 1 srednia = " + uczen.srednia());
        System.out.println("uczen 1 najwyzsza = " + uczen.najwyzsza());
        System.out.println("uczen 1 najnizsza = " + uczen.najnizsza());

        System.out.println("uczen 2 srednia = " + uczen2.srednia());
        System.out.println("uczen 2 najwyzsza = " + uczen2.najwyzsza());
        System.out.println("uczen 2 najnizsza = " + uczen2.najnizsza());

    }
}

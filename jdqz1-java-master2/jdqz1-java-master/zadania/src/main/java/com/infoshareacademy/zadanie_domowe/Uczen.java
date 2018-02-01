package com.infoshareacademy.zadanie_domowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uczen implements Comparable {

    private int numerUcznia;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny = new ArrayList<>();

    public int getNumerUcznia() {
        return numerUcznia;
    }

    public void setNumerUcznia(int numerUcznia) {
        this.numerUcznia = numerUcznia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public void setOceny(List<Integer> oceny) {
        this.oceny = oceny;
    }

    void ustawOceny() {
        for (int i = 0; i < 3; i++) {
            oceny.add((int) (Math.random() * 5 + 1));
        }
    }

    public double srednia() {
        double suma = 0;

        for (int ocena : oceny) {
            suma += ocena;
        }

        return suma / oceny.size();
    }

    public int najwyzsza() {
        int najwyzsza = 0;

        for (int ocena : oceny) {
            if (ocena > najwyzsza) {
                najwyzsza = ocena;
            }
        }
        return najwyzsza;
    }

    public int najnizsza() {
        int najnizsza = Integer.MAX_VALUE;

        for (int ocena : oceny) {
            if (ocena < najnizsza) {
                najnizsza = ocena;
            }
        }
        return najnizsza;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "numerUcznia=" + numerUcznia +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", oceny=" + oceny +
                '}';
    }


    public int compareTo(Object o) {
        Uczen uczen = (Uczen) o;

        int wynikPorownania = imie.compareTo(uczen.getImie());

        return wynikPorownania;
    }
}

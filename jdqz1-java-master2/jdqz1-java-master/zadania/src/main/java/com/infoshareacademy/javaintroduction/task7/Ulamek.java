package com.infoshareacademy.javaintroduction.task7;

public class Ulamek {

    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    void pomnoz(Ulamek u){
        licznik = licznik * u.licznik;
        mianownik = mianownik * u.mianownik;
    }

    void dodaj(Ulamek u){
        mianownik = mianownik * u.mianownik;
        licznik = licznik * u.mianownik + u.licznik * mianownik;
    }

    void wypisz(){
        System.out.println(licznik + " / " + mianownik);
    }


}

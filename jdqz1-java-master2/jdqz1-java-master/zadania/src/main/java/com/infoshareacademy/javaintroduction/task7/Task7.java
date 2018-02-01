package com.infoshareacademy.javaintroduction.task7;

public class Task7 {

    public static void main(String... args) {

        // ulamki - instancje
        Ulamek ulamek1 = new Ulamek(1,2);
        Ulamek ulamek2 = new Ulamek(1,1);

        ulamek1.dodaj(ulamek2);

        ulamek1.wypisz();


    }
}

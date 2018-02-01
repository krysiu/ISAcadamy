package com.infoshareacademy.zadanie_domowe;


public class Main {


    public static void main(String[] args) {

        Uczen uczen = new Uczen();
        uczen.setImie("Ania");
        uczen.setNazwisko("Kowalska");
        uczen.ustawOceny();



        // int[] ocenyJakoTablica = uczen.getOceny();

        for (int i = 0; i < 3; i++) {
           // uczen.getOceny()[i] = (int) (Math.random() * 5 + 1);
        }



       // System.out.println(uczen.getOceny()[0]);
       // System.out.println(uczen.getOceny()[1]);
       // System.out.println(uczen.getOceny()[2]);

        System.out.println("srednia = " + uczen.srednia());
        System.out.println("najwyzsza = " + uczen.najwyzsza());
        System.out.println("najnizsza = " + uczen.najnizsza());


    }
}

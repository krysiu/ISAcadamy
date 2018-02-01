package com.infoshareacademy.javaintroduction.interfejs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        JakisKonkretnyProdukt jakisKonkretnyProdukt = new JakisKonkretnyProdukt();
        Product produkt = new JakisKonkretnyProdukt();



        List<String> lista = new ArrayList<>();
        List<String> lista2 = new LinkedList<>();
        List<String> lista3 = new CopyOnWriteArrayList<>();


    }
}
